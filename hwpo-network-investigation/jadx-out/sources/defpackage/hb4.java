package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hb4 {
    public static final nf6<String, Typeface> a = new nf6<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final ep9<String, ArrayList<sy1<a>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new dq8());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ep9<>();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((bb4) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static a b(String str, Context context, List<bb4> list, int i) {
        int i2;
        Typeface typefaceB;
        nf6<String, Typeface> nf6Var = a;
        wra.a("getFontSync");
        try {
            Typeface typefaceC = nf6Var.c(str);
            if (typefaceC != null) {
                a aVar = new a(typefaceC);
                Trace.endSection();
                return aVar;
            }
            try {
                qb4 qb4VarA = ab4.a(context, list);
                List<rb4[]> list2 = qb4VarA.b;
                int i3 = qb4VarA.a;
                if (i3 == 0) {
                    rb4[] rb4VarArr = list2.get(0);
                    if (rb4VarArr == null || rb4VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = rb4VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = rb4VarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    a aVar2 = new a(i2);
                    Trace.endSection();
                    return aVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    rb4[] rb4VarArr2 = list2.get(0);
                    rza rzaVar = kza.a;
                    wra.a("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceB = kza.a.b(context, rb4VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    rza rzaVar2 = kza.a;
                    wra.a("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceB = kza.a.c(context, i, list2);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceB == null) {
                    a aVar3 = new a(-3);
                    Trace.endSection();
                    return aVar3;
                }
                nf6Var.d(str, typefaceB);
                a aVar4 = new a(typefaceB);
                Trace.endSection();
                return aVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                a aVar5 = new a(-1);
                Trace.endSection();
                return aVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
