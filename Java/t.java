public class S
{ public int c;
  public int d;

 public int calcula()
 { int j;
   j = c + d;
  return(j);
 }
}

public class T 
{ public int 

  public T()
  { e=0;
  }
  
  public T(int r)
  { e=r;
  }
  public int calcula(int valor)
  { return(valor+e+10);
  }
 }

 public class K 
 {public int a;
  public int b;

  public K()
  { a=0;
    b=0;
  }
  
  public K(int z, int y)
  { a=z;
    b=y;
  }
    
  public int calcula(int x)
  { int g;
    g = x + a + b;
    return(g);
  }

  public void setB(int h)
  { b = h;
  }
  public int getB()
  { return(b);
  }

 }
