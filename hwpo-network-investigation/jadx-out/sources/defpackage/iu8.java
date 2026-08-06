package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iu8 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final Resources a;
        public final Resources.Theme b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && Objects.equals(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c {
        public final void a(final int i) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ku8
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.b(i);
                }
            });
        }

        public abstract void b(int i);

        public abstract void c(Typeface typeface);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, c cVar, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            nf6<String, Typeface> nf6Var = kza.b;
            Typeface typefaceC = nf6Var.c(kza.b(resources, i, string, i3, i2));
            if (typefaceC != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ju8(cVar, typefaceC));
                }
                typefaceA = typefaceC;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ib4.a aVarA = ib4.a(resources.getXml(i), resources);
                        if (aVarA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (cVar != null) {
                                cVar.a(-3);
                            }
                        } else {
                            typefaceA = kza.a(context, aVarA, resources, i, string, typedValue.assetCookie, i2, cVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceD = kza.a.d(context, resources, i, string, i2);
                        if (typefaceD != null) {
                            nf6Var.d(kza.b(resources, i, string, i4, i2), typefaceD);
                        }
                        if (cVar != null) {
                            if (typefaceD != null) {
                                new Handler(Looper.getMainLooper()).post(new ju8(cVar, typefaceD));
                            } else {
                                cVar.a(-3);
                            }
                        }
                        typefaceA = typefaceD;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (cVar != null) {
                        cVar.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (cVar != null) {
                        cVar.a(-3);
                    }
                }
            }
        } else if (cVar != null) {
            cVar.a(-3);
        }
        if (typefaceA != null || cVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
