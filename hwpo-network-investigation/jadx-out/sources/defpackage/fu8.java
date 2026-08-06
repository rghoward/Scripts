package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fu8 implements lu3 {
    public final Uri a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<Uri> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            Uri uri = (Uri) obj;
            if (xj5.a(uri.getScheme(), "android.resource")) {
                return new fu8(uri, zk7Var);
            }
            return null;
        }
    }

    public fu8(Uri uri, zk7 zk7Var) {
        this.a = uri;
        this.b = zk7Var;
    }

    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) throws XmlPullParserException, IOException {
        Integer numF;
        Drawable drawable;
        Uri uri = this.a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (z2a.w(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) th1.H(uri.getPathSegments());
                if (str == null || (numF = v2a.f(str)) == null) {
                    p51.c(uri, "Invalid android.resource URI: ");
                    return null;
                }
                int iIntValue = numF.intValue();
                zk7 zk7Var = this.b;
                Context context = zk7Var.a;
                Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                boolean z = true;
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strB = v.b(MimeTypeMap.getSingleton(), charSequence.subSequence(z2a.y(charSequence, '/', 0, 6), charSequence.length()).toString());
                boolean zA = xj5.a(strB, "text/xml");
                jf2 jf2Var = jf2.v;
                if (!zA) {
                    TypedValue typedValue2 = new TypedValue();
                    return new tw9(new nw9(new ni8(ev6.c(resources.openRawResource(iIntValue, typedValue2))), new kd2(context, 1), new au8(authority, iIntValue, typedValue2.density)), strB, jf2Var);
                }
                if (authority.equals(context.getPackageName())) {
                    drawable = e00.b(context, iIntValue);
                    if (drawable == null) {
                        p.a(pp2.a(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = iu8.a;
                    drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        p.a(pp2.a(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                }
                if (!(drawable instanceof VectorDrawable) && !(drawable instanceof wcb)) {
                    z = false;
                }
                if (z) {
                    drawable = new BitmapDrawable(context.getResources(), e83.a(drawable, zk7Var.b, zk7Var.d, zk7Var.e, zk7Var.f));
                }
                return new u73(drawable, z, jf2Var);
            }
        }
        p51.c(uri, "Invalid android.resource URI: ");
        return null;
    }
}
