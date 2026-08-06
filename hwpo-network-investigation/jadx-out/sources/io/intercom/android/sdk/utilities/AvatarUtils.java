package io.intercom.android.sdk.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.dm3;
import defpackage.e;
import defpackage.eva;
import defpackage.f5a;
import defpackage.k85;
import defpackage.u30;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.coil.AvatarShapeTransformation;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AvatarUtils {
    public static void createAvatar(Avatar avatar, ImageView imageView, int i, AppConfig appConfig) {
        Context context = imageView.getContext();
        k85.a avatarImageRequestBuilder = getAvatarImageRequestBuilder(context, avatar, appConfig);
        avatarImageRequestBuilder.f(imageView);
        IntercomCoilKt.loadIntercomImage(context, avatarImageRequestBuilder.a());
    }

    public static k85.a getAvatarImageRequestBuilder(Context context, Avatar avatar, AppConfig appConfig) {
        Drawable placeHolderDrawable = getPlaceHolderDrawable(context, avatar, appConfig);
        String strSelectUrlForTheme = ThemeUtils.selectUrlForTheme(context, avatar.getImageUrl(), avatar.getImageDarkUrl());
        k85.a aVar = new k85.a(context);
        aVar.c = strSelectUrlForTheme;
        aVar.q = placeHolderDrawable;
        aVar.p = 0;
        aVar.s = placeHolderDrawable;
        aVar.r = 0;
        aVar.b();
        aVar.i = e.a(u30.E(new eva[]{new AvatarShapeTransformation(avatar.getShape())}));
        return aVar;
    }

    public static AvatarDefaultDrawable getDefaultDrawable(Context context, AppConfig appConfig) {
        return new AvatarDefaultDrawable(context, appConfig.getSecondaryColorDark());
    }

    public static AvatarInitialsDrawable getInitialsDrawable(String str, AppConfig appConfig) {
        return new AvatarInitialsDrawable(str.toUpperCase(), appConfig.getSecondaryColorDark());
    }

    public static Drawable getPlaceHolderDrawable(Context context, Avatar avatar, AppConfig appConfig) {
        return avatar.getInitials().isEmpty() ? getDefaultDrawable(context, appConfig) : getInitialsDrawable(avatar.getInitials(), appConfig);
    }

    public static void loadAvatarIntoView(Avatar avatar, ImageView imageView, AppConfig appConfig) {
        createAvatar(avatar, imageView, 0, appConfig);
    }

    public static void preloadAvatar(Avatar avatar, final Runnable runnable, Activity activity) {
        String strSelectUrlForTheme = ThemeUtils.selectUrlForTheme(activity, avatar.getImageUrl(), avatar.getImageDarkUrl());
        if (strSelectUrlForTheme == null || strSelectUrlForTheme.isEmpty()) {
            runnable.run();
            return;
        }
        k85.a aVar = new k85.a(activity);
        aVar.c = strSelectUrlForTheme;
        aVar.e = new k85.b() { // from class: io.intercom.android.sdk.utilities.AvatarUtils.1
            @Override // k85.b
            public void onError(k85 k85Var, dm3 dm3Var) {
                runnable.run();
            }

            @Override // k85.b
            public void onSuccess(k85 k85Var, f5a f5aVar) {
                runnable.run();
            }

            @Override // k85.b
            public void onCancel(k85 k85Var) {
            }

            @Override // k85.b
            public void onStart(k85 k85Var) {
            }
        };
        IntercomCoilKt.loadIntercomImage(activity, aVar.a());
    }
}
