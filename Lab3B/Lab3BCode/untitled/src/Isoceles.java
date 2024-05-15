public class Isoceles {
   public int s1,s2,s3;

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public boolean isIsoscelesButNotEquilateralTriangle(int s1, int s2, int s3) {
        return ((s1 == s2) && !(s1 == s3)) || ((s2 == s3) && !(s1 == s2)) || ((s1 == s3) && (s1
                == s2));
    }
}