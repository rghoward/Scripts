package io.intercom.android.sdk.blocks;

import android.graphics.Color;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageTextBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.utilities.FontUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ImageText implements ImageTextBlock {
    private final StyleType style;
    private final UploadingImageCache uploadingImageCache;

    public ImageText(StyleType styleType, UploadingImageCache uploadingImageCache) {
        this.style = styleType;
        this.uploadingImageCache = uploadingImageCache;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ImageTextBlock
    public View addImageText(Spanned spanned, Spanned spanned2, String str, String str2, int i, int i2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.intercom_image_text_block, viewGroup, false);
        View viewAddImage = new NetworkImage(this.style, this.uploadingImageCache, null).addImage(str, BuildConfig.FLAVOR, str2, i, i2, BlockAlignment.LEFT, blockMetadata, linearLayout);
        ((LinearLayout.LayoutParams) viewAddImage.getLayoutParams()).setMargins(0, 0, 0, 0);
        ((FrameLayout) linearLayout.findViewById(R.id.image_holder)).addView(viewAddImage);
        TextView textView = (TextView) linearLayout.findViewById(R.id.title);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.text);
        textView.setText(spanned);
        textView2.setText(spanned2);
        FontUtils.setRobotoMediumTypeface(textView);
        String textColor = blockMetadata.getAppearance().getTextColor();
        if (!TextUtils.isEmpty(textColor)) {
            int color = Color.parseColor(textColor);
            textView.setTextColor(color);
            textView2.setTextColor(color);
        }
        return linearLayout;
    }
}
