class demo{
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        if(num1>num2)
        {
            System.out.println(num1+"is greater than"+num2);
        }
        else
        {
            System.out.println(num1+"is not greater than"+num2);
        }
    }
}

class demo2{
    public static void main(String[]args) {
        String[] playlist1=new String[3];
        playlist1[0]="song1";
        System.out.println(playlist1[0]);
         playlist1[1]="song2";
        System.out.println(playlist1[1]);
        

    }
}

class arraymax{
    public static void main(String[]args) {
        int[]arr={10,30,60,80};
        int max=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }

        }
        System.out.println("max:"+max);
    }
}

class arraymin{
    public static void main(String[]args) {
        int[]arr={10,30,60,80};
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }

        }
        System.out.println("min:"+min);
    }
}