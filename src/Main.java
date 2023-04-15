import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Firma firma1=new Firma("Рога и копыта","Шиномонтаж ",1,0);
        Firma firma2=new Firma("Черт и ко","Банк ",2,100);
        Firma firma3=new Firma("Крысиный дом","Отель ",3,5000);
        Firma firma4=new Firma("Рыгаловка","Ресторан",4,10000);
        Firma firma5=new Firma("Ампутационная","Больница ",5,96514);
        Firma firma6=new Firma("Нагибаловка","Букмекерская ",6,321);
        Firma firma7=new Firma("Три колобка","фитнес ",7,0);
        Firma firma8=new Firma("Счастливы зять","Рыболовный магазин ",8,52456);
        Firma firma9=new Firma("Без лаптей","Банк ",9,856);
        Firma firma10=new Firma("И так сойдет","Строители ",10,15694);

        Taxing tax =new Taxing();
//        tax.addFirma(firma1);
//        tax.addFirma(firma2);
//        tax.addFirma(firma3);
//        tax.addFirma(firma4);
//        tax.addFirma(firma5);
        tax.addFirma(firma6);
//        tax.addFirma(firma7);
//        tax.addFirma(firma8);
//        tax.addFirma(firma9);
//        tax.addFirma(firma10);


//        tax.cheak();
//        tax.ff();
        tax.payTax(firma6,321);
//        tax.ff();
        tax.cheak(firma6);













    }
}