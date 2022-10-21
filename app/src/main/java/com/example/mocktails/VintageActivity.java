package com.example.mocktails;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"},
        d2 = {"Lcom/example/midterm_exam/VintageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "initData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class VintageActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_vintage);
        this.initData();
    }

    private final void initData() {
        Intent var10000 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(var10000, "intent");
        Bundle passedData = var10000.getExtras();
        TextView tvName = (TextView)this.findViewById(R.id.tvName);
        ImageView imageView = (ImageView)this.findViewById(R.id.imageView);
        Intrinsics.checkNotNull(passedData);
        String name = passedData.getString("name");
        int imageName = passedData.getInt("imageName");
        tvName.setText((CharSequence)name);
        imageView.setImageResource(imageName);
    }
}
