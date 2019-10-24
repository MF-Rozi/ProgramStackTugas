public class Stacking {
    Items box[];
    int top;

    public Stacking(int jumlah) {
        box = new Items[jumlah];
        top=-1;
    }
    public void push(int Berat,String Nama,String Alamat){
        if( top < box.length-1 ) {
            box[++top]=new Items(Berat,Nama,Alamat);
        }
    }

    public Items pop() {
        if( top >= 0 ) {
            Items  temp = box[top--];
            return temp;
        }
        return null;
    }

    public void print()
    {
        for (int i = box.length-1; i >= 0; i--) {
            System.out.printf("\n\nBarang :%s \nBerat :%d\nAlamat :%s\n\n",box[i].nama,box[i].weight,box[i].adress);
        }
    }

}
