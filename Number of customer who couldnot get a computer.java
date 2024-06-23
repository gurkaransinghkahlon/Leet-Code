static int maxChar = 26;
public int runCustomerSimulation(int n, char[] seq){
    int res = 0;
    int occupied = 0;
    char[] seen= new char[maxChar];
    for(int i=0; i<seq.length(); i++){
        int index = seq[i]-'A';
        if(seen[index] == 0){
            seen[index] = 1;
            if(occupied < n){
                occupied++;
                seen[index] = 2;
            }
            else{
                result++;
            }
        }
        else{
            if(Seen[index] == 2){
                occupied--;                
            }
            seen[index] = 0;
        }
    }
    return res;
}