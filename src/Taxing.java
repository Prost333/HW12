import java.util.*;

public class Taxing {
    private HashMap<String, Collection<Firma>> firmsMap;

    public HashMap<String, Collection<Firma>> getFirmsMap() {
        return firmsMap;
    }

    public void setFirmsMap(HashMap<String, Collection<Firma>> firmsMap) {
        this.firmsMap = firmsMap;
    }

    public Taxing() {
        firmsMap = new HashMap<>();
        Collection<Firma> f1 = new ArrayList<>();
        Collection<Firma> f2 = new ArrayList<>();
        Collection<Firma> f3 = new ArrayList<>();
        firmsMap.put("Нет долгов", f1);
        firmsMap.put("Не уплачено рублей до 10000", f2);
        firmsMap.put("Не уплачено рублей более 10000", f3);
    }

    public void addFirma(Firma firma) {
        int debit = firma.getDebit();

        Collection<Firma> firms = new ArrayList<>();
        if (debit == 0) {
            firms.add(firma);
            firmsMap.put("Нет долгов", firms);
        } else if (debit > 0 && debit < 10000) {
            firms.add(firma);
            firmsMap.put("Не уплачено рублей до 10000", firms);
        } else if (debit > 10000) {
            firms.add(firma);
            firmsMap.put("Не уплачено рублей более 10000", firms);
        }
        System.out.println(firma);


    }

    public void payTax(Firma firma, int money) {
        int debit = firma.getDebit();
        if (debit == 0) {
            firma.setDebit(0);
        } else {
            firma.setDebit(debit - money);
        }
    }

    public void cheak(Firma firma) {
        Collection<Collection<Firma>> values = firmsMap.values();
        if (firma.getDebit() == 0) {
            System.out.println("Нет долгов "+firmsMap.get("Нет долгов") );
        } else if (firma.getDebit() > 0 && firma.getDebit() < 10000) {
            System.out.println("Не уплачено рублей до 10000 "+firmsMap.get("Не уплачено рублей до 10000") );
        } else if (firma.getDebit()>10000) {
            System.out.println("Не уплачено рублей более 10000 "+firmsMap.get("Не уплачено рублей более 10000") );
        }

    }



}
