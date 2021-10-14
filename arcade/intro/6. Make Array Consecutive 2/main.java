int makeArrayConsecutive2(int[] statues) {
    if (statues.length == 0 || statues.length == 1)
        return 0;
    int min = statues[0];
    int max = statues[0];
    
    for (int i = 0; i <= statues.length-1; i++){
        if (statues[i] < min)
            min = statues[i];
        
        if (statues[i] > max)
            max = statues[i];
    }
    System.out.println(min + " "+max);
    int count=0;
    for (int i = min; i <= max; i++){
        boolean found = false;
        for (int j = 0; j < statues.length; j++){
               if (i==statues[j])
                    found = true;
        }
        if(!found)
            count++;
    }
    return count;
}
