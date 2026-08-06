package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final nu4 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jf2.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr2;
            int[] iArr3 = new int[s39.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        b = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        c = new nu4.a().d();
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || z2a.w(str)) {
            return null;
        }
        String strQ = z2a.Q(z2a.Q(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(z2a.M('.', z2a.M('/', strQ, strQ), BuildConfig.FLAVOR));
    }

    public static final tib c(View view) {
        tib tibVar;
        Object tag = view.getTag(R.id.coil_request_manager);
        tib tibVar2 = tag instanceof tib ? (tib) tag : null;
        if (tibVar2 != null) {
            return tibVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                tibVar = tag2 instanceof tib ? (tib) tag2 : null;
                if (tibVar == null) {
                    tibVar = new tib(view);
                    view.addOnAttachStateChangeListener(tibVar);
                    view.setTag(R.id.coil_request_manager, tibVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tibVar;
    }

    public static final boolean d(Uri uri) {
        return xj5.a(uri.getScheme(), "file") && xj5.a((String) th1.A(uri.getPathSegments()), "android_asset");
    }

    public static final int e(s03 s03Var, s39 s39Var) {
        if (s03Var instanceof s03.a) {
            return ((s03.a) s03Var).a;
        }
        int iOrdinal = s39Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        u.b();
        return 0;
    }
}
