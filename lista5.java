import java.time.LocalDateTime;

public class Post{
  LocalDateTime dataHorario;
  String textoPost;

  public Post(LocalDateTime dataHorario){
    this.dataHorario = dataHorario;
  }

  public Post(String textoPost){
  this.textoPost = textoPost;
  }

 public LocalDateTime getdataHorario(){
   return dataHorario; 
  } 

  public String gettextoPost(){
   return textoPost; 
  }
  
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dataHorario == null) ? 0 : dataHorario.hashCode());
    result = prime * result + ((textoPost == null) ? 0 : textoPost.hashCode());
    return result;
  }

  public boolean equals(Object obj) {
    if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		 Post other = (Post) obj;
		
		if (dataHorario == null) {
			if (other.dataHorario != null)
				return false;
		} else if (!dataHorario.equals(other.dataHorario))
			return false;
		
		if (textoPost == null) {
			if (other.textoPost != null)
				return false;
		} else if (!textoPost.equals(other.textoPost))
			return false;
		return true;
  }
}