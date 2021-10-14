int shapeArea(int n) {
    int inst = 1;
    for(int i = n-1; i > 0; i--){
        inst = inst + i * 4;
    }
    //inst = inst + 1;
    return inst;
}
