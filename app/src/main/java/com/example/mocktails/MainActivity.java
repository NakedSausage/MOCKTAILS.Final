package com.example.mocktails;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

import kotlin.Metadata;

@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u000e"},
        d2 = {"Lcom/example/midterm_exam/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "clickListener", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openBerryActivity", "openCitrusActivity", "openCranberryActivity", "openLemonadeActivity", "openShirleyActivity", "openVintageActivity", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.clickListener();


    }

    private final void clickListener() {
        ImageView imageBerry = (ImageView)this.findViewById(R.id.ivBerry);
        ImageView imageCitrus = (ImageView)this.findViewById(R.id.ivCitrus);
        ImageView imageCranberry = (ImageView)this.findViewById(R.id.ivCranberry);
        ImageView imageLemonade = (ImageView)this.findViewById(R.id.ivLemonade);
        ImageView imageShirley = (ImageView)this.findViewById(R.id.ivShirley);
        ImageView imageVintage = (ImageView)this.findViewById(R.id.ivVintage);
        imageBerry.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.openBerryActivity();
            }
        }));
        imageCitrus.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.openCitrusActivity();
            }
        }));
        imageCranberry.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.openCranberryActivity();
            }
        }));
        imageLemonade.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.openLemonadeActivity();
            }
        }));
        imageShirley.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.openShirleyActivity();
            }
        }));
        imageVintage.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.openVintageActivity();
            }
        }));
    }

    private final void openBerryActivity() {
        this.startActivity((new Intent((Context)this,BerryActivity.class)).putExtra("name", "Berry Burlesque \n\nIngredients\n\n.5 oz lime juice\n.5 oz honey syrup\n1 oz black currant puree\n4-6 mint leaves\nQ Ginger Beer\n\nInstructions\n\nCombine and shake all ingredients except ginger beer in a shaker tin with ice, and then strain over fresh ice. Top with ginger beer.\n\nBy Daniel Marohnic, property mixologist at ARIA Resort & Casino in Las Vegas\n").putExtra("imageName", R.drawable.berry_burlesque));
    }

    private final void openCitrusActivity() {
        this.startActivity((new Intent((Context)this, CitrusActivity.class)).putExtra("name", "Citrus Fizz \n\nIngredients\n\n1.75 oz Seedlip Grove 42\n.75 oz organic marmalade cordial*\nSparkling water, to top\n\nInstructions\n\nCombine Seedlip and cordial in a champagne flute and top with chilled sparkling water.\n\n*Instructions for organic marmalade cordial: Mix 300g organic marmalade with 150 mL hot water, Fine strain and store in the fridge.\n").putExtra("imageName", R.drawable.citrus_fizz));
    }

    private final void openCranberryActivity() {
        this.startActivity((new Intent((Context)this, CranberryActivity.class)).putExtra("name", " Dry Cranberry \n\nIngredients\n\n1.5 oz Seedlip Grove 42\n1 oz Monlin cranberry\n1 oz Lime juice\n2 dashes Orange bitters\nTop off with Q Grapefruit soda\n\nInstructions\n\nCombine all the ingredients (except the Q Grapefruit) in a cocktail shaker over ice. Shake vigorously. Strain into an iced Collins glass and top with Q Grapefruit. Stir well and garnish.").putExtra("imageName", R.drawable.dry_cranberry));
    }

    private final void openLemonadeActivity() {
        this.startActivity((new Intent((Context)this, LemonadeActivity.class)).putExtra("name", "Lavender Lemonade\n\nIngredients\n\n6 cups water\n.5 cup honey\n5 tbsp dried lavender\n1 cup fresh lemon juice, strained\n\nInstructions\n\nBring water and honey to a boil in a large pot over medium-high heat. Gently crush the lavender in a mortar and pestle or in a bowl with a meat tenderizer. Add the crushed lavender to the pot then remove it from the heat. Cover, refrigerate, and steep for 2 hours. Strain the liquid through a fine mesh sieve. Stir in the lemon juice and serve over ice.").putExtra("imageName", R.drawable.lavender_lemonade));
    }

    private final void openShirleyActivity() {
        this.startActivity((new Intent((Context)this, ShirleyActivity.class)).putExtra("name", "Shirley Ginger \n\nIngredients\n\n4 cups Brooklyn Crafted Lemon Lime Ginger Beer\n1 cup club soda\n3 tbsp lime juice\n.25 cup grenadine\n\nInstructions\n\nStir ginger beer, club soda, lime juice, and grenadine in a pitcher. Pour into tall glasses with ice. Garnish with lime rounds and or maraschino cherries.\n ").putExtra("imageName", R.drawable.shirley_ginger));
    }

    private final void openVintageActivity() {
        this.startActivity((new Intent((Context)this, VintageActivity.class)).putExtra("name", "Vintage Point \n\nIngredients\n\n2 oz ‘New London Light’\n2 oz coffee (cold brew, decaffeinated or fresh)\n.5 oz agave syrup\nOrange peel to garnish\n\nInstructions\n\nPlace all the ingredients in a Boston shaker with plenty of ice. Shake for 15 seconds and strain into a tumbler over a large ice cube. Garnish with a twist of orange peel.\n").putExtra("imageName", R.drawable.vintage_point));
    }
}
