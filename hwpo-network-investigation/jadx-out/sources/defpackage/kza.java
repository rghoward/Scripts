package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kza {
    public static final rza a;
    public static final nf6<String, Typeface> b;
    public static Paint c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends sb4 {
        public iu8.c u;
    }

    static {
        wra.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new qza();
        } else if (i >= 29) {
            a = new pza();
        } else if (i >= 28) {
            a = new oza();
        } else if (i >= 26) {
            a = new nza();
        } else {
            Method method = mza.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new mza();
            } else {
                a = new lza();
            }
        }
        b = new nf6<>(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, ib4.a aVar, Resources resources, int i, String str, int i2, int i3, iu8.c cVar, boolean z) {
        Typeface typefaceA;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        if (aVar instanceof ib4.d) {
            ib4.d dVar = (ib4.d) aVar;
            String str2 = dVar.d;
            typefaceA = null;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList.size()) {
                                        bb4 bb4Var = (bb4) arrayList.get(i5);
                                        if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(bb4Var.f)) {
                                            customFallbackBuilder.setSystemFallback(bb4Var.e);
                                        } else {
                                            String str3 = bb4Var.e;
                                            String str4 = bb4Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + bb4Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(jza.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((bb4) arrayList.get(i4)).e) != null) {
                                i4++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((bb4) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ju8(cVar, typefaceBuild));
                }
                b.d(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z2 = !z ? cVar != null : dVar.c != 0;
            int i6 = z ? dVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar2 = new a();
            aVar2.u = cVar;
            ArrayList arrayList2 = dVar.a;
            eq8 eq8Var = new eq8(handler);
            d31 d31Var = new d31(aVar2, eq8Var);
            if (!z2) {
                String strA = hb4.a(i3, arrayList2);
                Typeface typefaceC = hb4.a.c(strA);
                if (typefaceC != null) {
                    eq8Var.execute(new b31(aVar2, typefaceC));
                    typefaceA = typefaceC;
                } else {
                    eb4 eb4Var = new eb4(d31Var);
                    synchronized (hb4.c) {
                        try {
                            ep9<String, ArrayList<sy1<hb4.a>>> ep9Var = hb4.d;
                            ArrayList<sy1<hb4.a>> arrayList3 = ep9Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(eb4Var);
                            } else {
                                ArrayList<sy1<hb4.a>> arrayList4 = new ArrayList<>();
                                arrayList4.add(eb4Var);
                                ep9Var.put(strA, arrayList4);
                                fb4 fb4Var = new fb4(strA, context, arrayList2, i3);
                                ThreadPoolExecutor threadPoolExecutor = hb4.b;
                                gb4 gb4Var = new gb4(strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                fq8 fq8Var = new fq8();
                                fq8Var.t = fb4Var;
                                fq8Var.u = gb4Var;
                                fq8Var.v = handler2;
                                threadPoolExecutor.execute(fq8Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    z90.a("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                bb4 bb4Var2 = (bb4) arrayList2.get(0);
                nf6<String, Typeface> nf6Var = hb4.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{bb4Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = hb4.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typefaceC2 = hb4.a.c(strA2);
                if (typefaceC2 != null) {
                    eq8Var.execute(new b31(aVar2, typefaceC2));
                    typefaceA = typefaceC2;
                } else if (i6 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{bb4Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    hb4.a aVarB = hb4.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    d31Var.a(aVarB);
                    typefaceA = aVarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    hb4.a aVar3 = (hb4.a) hb4.b.submit(new db4(strA2, context, bb4Var2, i3)).get(i6, TimeUnit.MILLISECONDS);
                                    d31Var.a(aVar3);
                                    typefaceA = aVar3.a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        d31Var.b.execute(new c31(d31Var.a, -3));
                    }
                }
            }
        } else {
            typefaceA = a.a(context, (ib4.b) aVar, resources, i3);
            if (cVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new ju8(cVar, typefaceA));
                } else {
                    cVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            b.d(b(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
