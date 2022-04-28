package sv.edu.udb.dogapi;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import sv.edu.udb.dogapi.databinding.ItemDogBinding;

public class DogViewHolder extends RecyclerView.ViewHolder {

    private ItemDogBinding itemDogBinding;

    public DogViewHolder(View view){
        //llama al constructor (este caso de la clase que heredo)
        super(view);
        itemDogBinding=ItemDogBinding.bind(view);
    }

    public void bind(String imageUrl){
        Picasso.get().load(imageUrl).into(itemDogBinding.ivDog);
    }
}
