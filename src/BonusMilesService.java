public class BonusMilesService {
     public int calculate (int price) {
         int bon = 20;
         int miles = price / bon;
         return miles;
     }
}
