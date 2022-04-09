import java.io.File;
public class Demo{
   static void print_recursively(File[] my_arr,int my_index,int sub_level){
      if(my_index == my_arr.length)
      return;
      for (int i = 0; i < sub_level; i++)
         System.out.print("\t");
      if(my_arr[my_index].isFile())
         System.out.println(my_arr[my_index].getName());
      else if(my_arr[my_index].isDirectory()){
         System.out.println("[" + my_arr[my_index].getName() + "]");
         print_recursively(my_arr[my_index].listFiles(), 0, sub_level + 1);
      }
      print_recursively(my_arr,++my_index, sub_level);
   }
   public static void main(String[] args){
      String path_main = "path to folder that contains files";
      File main_dir = new File(path_main);
      if(main_dir.exists() && main_dir.isDirectory()){
         File my_arr[] = main_dir.listFiles();
         System.out.println("Files listed from the main directory are : " + main_dir);
         print_recursively(my_arr,0,0);
      }
   }
}