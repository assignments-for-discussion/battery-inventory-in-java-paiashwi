package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    //to travese charge cycle array
      for(int i=0;i<cycles.length;i++){
        //charge is less than 410 times
      if(cycles[i]<=410)
      lowCount++;
      //charge between 410 and 949
      if(cycles[i]>410&&cycles[i]<=949)
      mediumCount++;
      //charge is more than 949 times
      if(cycles[i]>949)
      highCount++;
      }
      
    
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}