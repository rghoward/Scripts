package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import defpackage.cy8;
import defpackage.dm3;
import defpackage.e;
import defpackage.eva;
import defpackage.f5a;
import defpackage.k85;
import defpackage.mn9;
import defpackage.u30;
import defpackage.ys7;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.coil.GrayscaleTransformation;
import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import io.intercom.android.sdk.views.ResizableImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class NetworkImage extends Image implements ImageBlock {
    private final ImageClickListener listener;
    private final Twig twig;
    private final UploadingImageCache uploadingImageCache;

    public NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache, ImageClickListener imageClickListener) {
        super(styleType);
        this.twig = LumberMill.getLogger();
        this.uploadingImageCache = uploadingImageCache;
        this.listener = imageClickListener;
    }

    private void loadImageFromUrl(final String str, final String str2, final Context context, final int i, final int i2, final ResizableImageView resizableImageView, final mn9 mn9Var) {
        if (TextUtils.isEmpty(str)) {
            hideLoadingState(mn9Var, resizableImageView);
            resizableImageView.setImageResource(R.drawable.intercom_image_load_failed);
            resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        k85.a aVar = new k85.a(context);
        aVar.c(R.drawable.intercom_image_load_failed);
        aVar.b();
        aVar.f(resizableImageView);
        aVar.c = str;
        setImageViewBounds(i, i2, resizableImageView, aVar);
        Resources resources = context.getResources();
        if (getStyle() != StyleType.CAROUSEL) {
            if (ImageUtils.isGif(str)) {
                RoundedCornersAnimatedTransformation roundedCornersAnimatedTransformation = new RoundedCornersAnimatedTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners));
                String string = roundedCornersAnimatedTransformation.toString();
                ys7.a aVar2 = aVar.o;
                if (aVar2 == null) {
                    aVar2 = new ys7.a();
                    aVar.o = aVar2;
                }
                aVar2.a.put("coil#animated_transformation", new ys7.b(roundedCornersAnimatedTransformation, string));
            } else {
                float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners);
                aVar.i = e.a(u30.E(new eva[]{new cy8(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize)}));
            }
        }
        Uri localImageUriForRemoteUrl = this.uploadingImageCache.getLocalImageUriForRemoteUrl(str);
        if (localImageUriForRemoteUrl != null) {
            aVar.i = e.a(u30.E(new eva[]{new GrayscaleTransformation()}));
            aVar.c = localImageUriForRemoteUrl;
        }
        aVar.e = new k85.b() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1
            @Override // k85.b
            public void onError(k85 k85Var, dm3 dm3Var) {
                ResizableImageView resizableImageView2 = resizableImageView;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                resizableImageView2.setScaleType(scaleType);
                NetworkImage.this.hideLoadingState(mn9Var, resizableImageView);
                NetworkImage.this.twig.internal("images", "FAILURE");
                resizableImageView.setScaleType(scaleType);
            }

            @Override // k85.b
            public void onSuccess(k85 k85Var, f5a f5aVar) {
                NetworkImage.this.twig.internal("images", "SUCCESS");
                NetworkImage.this.hideLoadingState(mn9Var, resizableImageView);
                if (NetworkImage.this.getStyle() == StyleType.CHAT_FULL || NetworkImage.this.listener == null) {
                    return;
                }
                resizableImageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        ImageClickListener imageClickListener = NetworkImage.this.listener;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        imageClickListener.onImageClicked(str, str2, resizableImageView, i, i2);
                    }
                });
            }

            @Override // k85.b
            public void onCancel(k85 k85Var) {
            }

            @Override // k85.b
            public void onStart(k85 k85Var) {
            }
        };
        IntercomCoilKt.loadIntercomImage(context, aVar.a());
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock
    public View addImage(String str, String str2, String str3, int i, int i2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int iDpToPx = ScreenUtils.dpToPx(i, context);
        int iDpToPx2 = ScreenUtils.dpToPx(i2, context);
        mn9 intercomShimmerLayout = new IntercomShimmerLayout(context);
        BlockUtils.createLayoutParams(intercomShimmerLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(intercomShimmerLayout);
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setTransitionName(LightBoxActivity.TRANSITION_KEY);
        resizableImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        setBackground(resizableImageView);
        intercomShimmerLayout.addView(resizableImageView);
        loadImageFromUrl(str, str2, context, iDpToPx, iDpToPx2, resizableImageView, intercomShimmerLayout);
        BlockUtils.setLayoutMarginsAndGravity(intercomShimmerLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(resizableImageView);
            return intercomShimmerLayout;
        }
        if (!TextUtils.isEmpty(str3)) {
            resizableImageView.setFocusable(true);
            resizableImageView.setContentDescription(str3);
        }
        return intercomShimmerLayout;
    }

    public int getSampleSize(int i, int i2, DisplayMetrics displayMetrics) {
        int i3 = displayMetrics.widthPixels;
        if (i > i3 || i2 > displayMetrics.heightPixels) {
            return (int) Math.pow(2.0d, (int) Math.ceil(Math.log(((double) i3) / ((double) Math.max(i2, i))) / Math.log(0.5d)));
        }
        return 1;
    }

    public void hideLoadingState(mn9 mn9Var, ImageView imageView) {
        if (mn9Var != null) {
            mn9Var.hideShimmer();
            imageView.setBackgroundResource(android.R.color.transparent);
        }
    }
}
