package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.content.FileProvider;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.ad1;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.e;
import defpackage.et2;
import defpackage.eva;
import defpackage.g2b;
import defpackage.i23;
import defpackage.k85;
import defpackage.mh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.u02;
import defpackage.u30;
import defpackage.v72;
import defpackage.wr2;
import defpackage.xm2;
import defpackage.yoa;
import defpackage.z2a;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushBitmapUtilsKt {
    private static final float BIG_PICTURE_HEIGHT_DP = 256.0f;
    private static final float BIG_PICTURE_WIDTH_DP = 512.0f;
    private static final long IMAGE_LOAD_TIMEOUT_MS = 10000;
    private static final float LARGE_ICON_SIZE_DP = 48.0f;
    private static final Twig twig;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadAvatarBitmap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt", f = "IntercomPushBitmapUtils.kt", l = {102}, m = "loadAvatarBitmap")
    public static final class AnonymousClass1 extends u02 {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IntercomPushBitmapUtilsKt.loadAvatarBitmap(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadAvatarBitmap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadAvatarBitmap$2", f = "IntercomPushBitmapUtils.kt", l = {103}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AvatarDefaultDrawable $defaultDrawable;
        final /* synthetic */ int $iconSize;
        final /* synthetic */ k85 $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, k85 k85Var, AvatarDefaultDrawable avatarDefaultDrawable, int i, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$context = context;
            this.$request = k85Var;
            this.$defaultDrawable = avatarDefaultDrawable;
            this.$iconSize = i;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass2(this.$context, this.$request, this.$defaultDrawable, this.$iconSize, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Bitmap> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                Context context = this.$context;
                k85 k85Var = this.$request;
                this.label = 1;
                obj = IntercomCoilKt.loadIntercomImageSuspend(context, k85Var, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            Drawable drawable = (Drawable) obj;
            if (drawable == null) {
                drawable = this.$defaultDrawable;
            }
            drawable.getClass();
            int i2 = this.$iconSize;
            return BitmapUtilsKt.drawableToBitmap(drawable, i2, i2);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1", f = "IntercomPushBitmapUtils.kt", l = {65, 66}, m = "invokeSuspend")
    public static final class C03871 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ AppConfig $appConfig;
        final /* synthetic */ String $authorName;
        final /* synthetic */ String $avatarImageUrl;
        final /* synthetic */ String $contentImageUrl;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $hasAuthorName;
        final /* synthetic */ boolean $hasAvatarUrl;
        final /* synthetic */ boolean $hasContentImage;
        final /* synthetic */ ci4<Bitmap, Bitmap, g2b> $onUpdate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03871(boolean z, boolean z2, boolean z3, ci4<? super Bitmap, ? super Bitmap, g2b> ci4Var, Context context, String str, String str2, AppConfig appConfig, String str3, r02<? super C03871> r02Var) {
            super(2, r02Var);
            this.$hasContentImage = z;
            this.$hasAvatarUrl = z2;
            this.$hasAuthorName = z3;
            this.$onUpdate = ci4Var;
            this.$context = context;
            this.$contentImageUrl = str;
            this.$avatarImageUrl = str2;
            this.$appConfig = appConfig;
            this.$authorName = str3;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            C03871 c03871 = new C03871(this.$hasContentImage, this.$hasAvatarUrl, this.$hasAuthorName, this.$onUpdate, this.$context, this.$contentImageUrl, this.$avatarImageUrl, this.$appConfig, this.$authorName, r02Var);
            c03871.L$0 = obj;
            return c03871;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03871) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0087 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0014, B:39:0x0092, B:40:0x0095, B:44:0x00a3, B:48:0x00af, B:51:0x00bf, B:14:0x0026, B:33:0x007e, B:36:0x0087, B:17:0x0031, B:19:0x0036, B:21:0x0045, B:23:0x0049, B:29:0x0070, B:24:0x0059, B:26:0x005d), top: B:56:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0095 A[Catch: Exception -> 0x0019, PHI: r1 r5
          0x0095: PHI (r1v13 android.graphics.Bitmap) = (r1v10 android.graphics.Bitmap), (r1v14 android.graphics.Bitmap) binds: [B:35:0x0085, B:39:0x0092] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r5v1 android.graphics.Bitmap) = (r5v0 android.graphics.Bitmap), (r5v3 android.graphics.Bitmap) binds: [B:35:0x0085, B:39:0x0092] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0014, B:39:0x0092, B:40:0x0095, B:44:0x00a3, B:48:0x00af, B:51:0x00bf, B:14:0x0026, B:33:0x007e, B:36:0x0087, B:17:0x0031, B:19:0x0036, B:21:0x0045, B:23:0x0049, B:29:0x0070, B:24:0x0059, B:26:0x005d), top: B:56:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:50:0x00bd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:51:0x00bf A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0014, B:39:0x0092, B:40:0x0095, B:44:0x00a3, B:48:0x00af, B:51:0x00bf, B:14:0x0026, B:33:0x007e, B:36:0x0087, B:17:0x0031, B:19:0x0036, B:21:0x0045, B:23:0x0049, B:29:0x0070, B:24:0x0059, B:26:0x005d), top: B:56:0x000a }] */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        
            if (r14 == r6) goto L38;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt.C03871.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadContentBitmap$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadContentBitmap$2", f = "IntercomPushBitmapUtils.kt", l = {88}, m = "invokeSuspend")
    public static final class C03882 extends p6a implements ci4<t72, r02<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $height;
        final /* synthetic */ k85 $request;
        final /* synthetic */ int $width;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03882(Context context, k85 k85Var, int i, int i2, r02<? super C03882> r02Var) {
            super(2, r02Var);
            this.$context = context;
            this.$request = k85Var;
            this.$width = i;
            this.$height = i2;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03882(this.$context, this.$request, this.$width, this.$height, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Bitmap> r02Var) {
            return ((C03882) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                Context context = this.$context;
                k85 k85Var = this.$request;
                this.label = 1;
                obj = IntercomCoilKt.loadIntercomImageSuspend(context, k85Var, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            Drawable drawable = (Drawable) obj;
            if (drawable != null) {
                return BitmapUtilsKt.drawableToBitmap(drawable, this.$width, this.$height);
            }
            return null;
        }
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap generateInitialsAvatar(Context context, String str, AppConfig appConfig) {
        Drawable defaultDrawable;
        int iDpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_DP, context);
        try {
            defaultDrawable = AvatarUtils.getInitialsDrawable(NameUtils.getInitial(str), appConfig);
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to generate initials avatar: ")), new Object[0]);
            defaultDrawable = AvatarUtils.getDefaultDrawable(context, appConfig);
        }
        defaultDrawable.getClass();
        return BitmapUtilsKt.drawableToBitmap(defaultDrawable, iDpToPx, iDpToPx);
    }

    public static final Uri getBitmapUri(Context context, Bitmap bitmap) {
        context.getClass();
        bitmap.getClass();
        try {
            File file = new File(context.getCacheDir(), "images");
            file.mkdirs();
            String string = UUID.randomUUID().toString();
            string.getClass();
            File file2 = new File(file, string.concat(".png"));
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to create bitmap URI: ")), new Object[0]);
            return null;
        }
    }

    private static final boolean isValidImageUrl(String str) {
        if (z2a.w(str) || !URLUtil.isValidUrl(str)) {
            return false;
        }
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAvatarBitmap(Context context, String str, AppConfig appConfig, r02<? super Bitmap> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AvatarDefaultDrawable avatarDefaultDrawable;
        int i;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object objB = anonymousClass1.result;
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            dv8.b(objB);
            int iDpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_DP, context);
            AvatarDefaultDrawable defaultDrawable = AvatarUtils.getDefaultDrawable(context, appConfig);
            k85.a aVar = new k85.a(context);
            aVar.s = defaultDrawable;
            aVar.r = 0;
            aVar.i = e.a(u30.E(new eva[]{new ad1()}));
            aVar.c = str;
            aVar.e(iDpToPx, iDpToPx);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, aVar.a(), defaultDrawable, iDpToPx, null);
            anonymousClass1.L$0 = defaultDrawable;
            anonymousClass1.I$0 = iDpToPx;
            anonymousClass1.label = 1;
            objB = yoa.b(IMAGE_LOAD_TIMEOUT_MS, anonymousClass2, anonymousClass1);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            avatarDefaultDrawable = defaultDrawable;
            i = iDpToPx;
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = anonymousClass1.I$0;
            avatarDefaultDrawable = (AvatarDefaultDrawable) anonymousClass1.L$0;
            dv8.b(objB);
        }
        Bitmap bitmap = (Bitmap) objB;
        if (bitmap != null) {
            return bitmap;
        }
        avatarDefaultDrawable.getClass();
        return BitmapUtilsKt.drawableToBitmap(avatarDefaultDrawable, i, i);
    }

    public static final void loadBitmaps(Context context, AppConfig appConfig, String str, String str2, String str3, mh4<g2b> mh4Var, ci4<? super Bitmap, ? super Bitmap, g2b> ci4Var) throws Throwable {
        context.getClass();
        appConfig.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        mh4Var.getClass();
        ci4Var.getClass();
        mh4Var.invoke();
        boolean zIsValidImageUrl = isValidImageUrl(str);
        boolean zIsValidImageUrl2 = isValidImageUrl(str2);
        boolean zW = z2a.w(str3);
        boolean z = !zW;
        if (zIsValidImageUrl || zIsValidImageUrl2 || !zW) {
            twig.d("loadBitmaps: hasContentImage=" + zIsValidImageUrl + ", hasAvatarUrl=" + zIsValidImageUrl2 + ", hasAuthorName=" + z, new Object[0]);
            et2 et2Var = i23.a;
            oy0.f(wr2.v, new C03871(zIsValidImageUrl, zIsValidImageUrl2, z, ci4Var, context, str, str2, appConfig, str3, null));
        }
    }

    public static /* synthetic */ void loadBitmaps$default(Context context, AppConfig appConfig, String str, String str2, String str3, mh4 mh4Var, ci4 ci4Var, int i, Object obj) throws Throwable {
        if ((i & 4) != 0) {
            str = BuildConfig.FLAVOR;
        }
        if ((i & 8) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 16) != 0) {
            str3 = BuildConfig.FLAVOR;
        }
        loadBitmaps(context, appConfig, str, str2, str3, mh4Var, ci4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadContentBitmap(Context context, String str, r02<? super Bitmap> r02Var) {
        int iDpToPx = ScreenUtils.dpToPx(BIG_PICTURE_WIDTH_DP, context);
        int iDpToPx2 = ScreenUtils.dpToPx(BIG_PICTURE_HEIGHT_DP, context);
        k85.a aVar = new k85.a(context);
        aVar.c = str;
        aVar.e(iDpToPx, iDpToPx2);
        return yoa.b(IMAGE_LOAD_TIMEOUT_MS, new C03882(context, aVar.a(), iDpToPx, iDpToPx2, null), r02Var);
    }
}
