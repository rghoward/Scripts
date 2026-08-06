package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rt8 implements pt8<Uri, Drawable> {
    public static final mk7<Resources.Theme> b = new mk7<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, mk7.e);
    public final Context a;

    public rt8(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.pt8
    public final /* bridge */ /* synthetic */ kt8<Drawable> a(Uri uri, int i, int i2, xk7 xk7Var) {
        return c(uri, xk7Var);
    }

    @Override // defpackage.pt8
    public final boolean b(Uri uri, xk7 xk7Var) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final kt8 c(Uri uri, xk7 xk7Var) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            sp2.b(uri, " is null or empty", "Package name for ");
            return null;
        }
        Context context = this.a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                u.c(uri, "Failed to find resource id for: ");
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                u.c(uri, "Unrecognized Uri format: ");
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) xk7Var.c(b) : null;
        Drawable drawableA = theme == null ? n73.a(context, contextCreatePackageContext, identifier, null) : n73.a(context, context, identifier, theme);
        if (drawableA != null) {
            return new bc7(drawableA);
        }
        return null;
    }
}
