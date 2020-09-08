abstract class ExohikiKatoikia {
    private String typeName;
    private String periohi_Poli;
    private int typeID;
    private int nrOfDays;
    private int timiHmeras;

    abstract String getEnoikioType();

    abstract double calcEnoikio();

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setPeriohi_Poli(String periohi_Poli) {
        this.periohi_Poli = periohi_Poli;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public void setNrOfDays(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    public void setTimiHmeras(int timiHmeras) {
        this.timiHmeras = timiHmeras;
    }

    public int getNrOfDays() {
        return nrOfDays;
    }

    public int getTimiHmeras() {
        return timiHmeras;
    }

    @Override
    public String toString() {
        return "ExohikiKatoikia [nrOfDays=" + nrOfDays + ", periohi_Poli=" + periohi_Poli + ", timiHmeras=" + timiHmeras
                + ", typeID=" + typeID + ", typeName=" + typeName + "]";
    }
}

class Domatio extends ExohikiKatoikia {
    private int DomationTypeID;

    @Override
    String getEnoikioType() {
        return "day";
    }

    @Override
    double calcEnoikio() {
        return getNrOfDays() * getTimiHmeras();
    }

    public void setDomationTypeID(int domationTypeID) {
        DomationTypeID = domationTypeID;
    }

    @Override
    public String toString() {
        return super.toString() + " Domatio [DomationTypeID=" + DomationTypeID + "]";
    }
}

class Bungalow extends ExohikiKatoikia {
    private int PlithosDomation;

    @Override
    String getEnoikioType() {
        return "week";
    }

    @Override
    double calcEnoikio() {
        try {
            if (getNrOfDays() >= 7) {
                return getNrOfDays() * getTimiHmeras() * 0.9;
            } else {
                throw new Exception("WrongRentPeriodException");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void setPlithosDomation(int plithosDomation) {
        PlithosDomation = plithosDomation;
    }

    @Override
    public String toString() {
        return super.toString() + " Bungalow [PlithosDomation=" + PlithosDomation + "]";
    }
}

class Villa extends ExohikiKatoikia {
    private int PlithosDomation;

    @Override
    String getEnoikioType() {
        return "month";
    }

    @Override
    double calcEnoikio() {
        try {
            if (getNrOfDays() >= 30) {
                return getNrOfDays() * getTimiHmeras() * 0.9;
            } else {
                throw new WrongRentPeriodException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void setPlithosDomation(int plithosDomation) {
        PlithosDomation = plithosDomation;
    }

    @Override
    public String toString() {
        return super.toString() + " Villa [PlithosDomation=" + PlithosDomation + "]";
    }
}

class K3_Thema3 {
    public static void main(String[] args) {
        int plithos = 3;
        ExohikiKatoikia[] arr = new ExohikiKatoikia[plithos];

        arr[0] = new Domatio();
        arr[0].setTypeID(1);
        arr[0].setTypeName("a");
        arr[0].setPeriohi_Poli("b");
        arr[0].setNrOfDays(5);
        arr[0].setTimiHmeras(40);
        ((Domatio) arr[0]).setDomationTypeID(2);

        arr[1] = new Bungalow();
        arr[1].setTypeID(2);
        arr[1].setTypeName("c");
        arr[1].setPeriohi_Poli("d");
        arr[1].setNrOfDays(5);
        arr[1].setTimiHmeras(30);
        ((Bungalow) arr[1]).setPlithosDomation(3);

        arr[2] = new Villa();
        arr[2].setTypeID(3);
        arr[2].setTypeName("e");
        arr[2].setPeriohi_Poli("f");
        arr[2].setNrOfDays(5);
        arr[2].setTimiHmeras(20);
        ((Villa) arr[2]).setPlithosDomation(5);

        for (ExohikiKatoikia exohikiKatoikia : arr) {
            System.out.println(exohikiKatoikia.toString());
            System.out.println("Total rent is " + exohikiKatoikia.calcEnoikio() + " and is payed per "
                    + exohikiKatoikia.getEnoikioType());
        }
    }
}

class WrongRentPeriodException extends Exception {
    private static final long serialVersionUID = 1L;
}