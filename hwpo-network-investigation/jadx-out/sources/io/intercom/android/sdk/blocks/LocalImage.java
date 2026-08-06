package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import defpackage.cy8;
import defpackage.dm3;
import defpackage.e;
import defpackage.eva;
import defpackage.f5a;
import defpackage.k85;
import defpackage.u30;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class LocalImage extends Image implements LocalImageBlock {
    private final Twig twig;

    public LocalImage(StyleType styleType) {
        super(styleType);
        this.twig = LumberMill.getLogger();
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock
    public View addImage(Uri uri, int i, int i2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int iDpToPx = ScreenUtils.dpToPx(i, context);
        int iDpToPx2 = ScreenUtils.dpToPx(i2, context);
        ProgressFrameLayout progressFrameLayout = new ProgressFrameLayout(context);
        BlockUtils.createLayoutParams(progressFrameLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(progressFrameLayout);
        final ResizableImageView resizableImageView = new ResizableImageView(context);
        BlockUtils.createLayoutParams(resizableImageView, -2, -2);
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        progressFrameLayout.addView(resizableImageView);
        k85.a aVar = new k85.a(context);
        aVar.f(resizableImageView);
        aVar.c = uri;
        setImageViewBounds(iDpToPx, iDpToPx2, resizableImageView, aVar);
        View childAt = progressFrameLayout.getChildAt(0);
        Resources resources = context.getResources();
        if (childAt instanceof UploadProgressBar) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_local_image_upload_size);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            childAt.bringToFront();
            progressFrameLayout.uploadStarted();
        }
        setBackground(resizableImageView);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        resizableImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners);
        aVar.i = e.a(u30.E(new eva[]{new cy8(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2)}));
        aVar.b();
        aVar.e = new k85.b() { // from class: io.intercom.android.sdk.blocks.LocalImage.1
            @Override // k85.b
            public void onError(k85 k85Var, dm3 dm3Var) {
                LocalImage.this.twig.internal("images", "FAILURE");
            }

            @Override // k85.b
            public void onSuccess(k85 k85Var, f5a f5aVar) {
                LocalImage.this.twig.internal("images", "SUCCESS");
                resizableImageView.setBackgroundResource(android.R.color.transparent);
            }

            @Override // k85.b
            public void onCancel(k85 k85Var) {
            }

            @Override // k85.b
            public void onStart(k85 k85Var) {
            }
        };
        IntercomCoilKt.loadIntercomImage(context, aVar.a());
        BlockUtils.setLayoutMarginsAndGravity(progressFrameLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        return progressFrameLayout;
    }
}
