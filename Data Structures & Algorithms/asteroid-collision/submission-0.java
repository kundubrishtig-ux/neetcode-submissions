class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> stack=new Stack<>();
      for(int a:asteroids)
      {
        while(a<0 && !stack.isEmpty() && stack.peek()>0)
        {
            if(stack.peek()<-a)
            {
                 stack.pop();
            }
            else if(stack.peek()==-a)
            {
                stack.pop();
                a=0;
            }
            else
            {
                a=0;
            }
        }
        if(a!=0)
        {
            stack.push(a);
        }
      }
      int[] result=new int[stack.size()];
      for(int i=0;i<stack.size();i++)
      {
        result[i]=stack.get(i);
      }
      return result;
    }
}