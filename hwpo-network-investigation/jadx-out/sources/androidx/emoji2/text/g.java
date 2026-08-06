package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.emoji2.text.h;
import defpackage.ab4;
import defpackage.b78;
import defpackage.bb4;
import defpackage.jl;
import defpackage.pk;
import defpackage.qb4;
import defpackage.rb4;
import defpackage.ru3;
import defpackage.wu1;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends d.c {
    public static final a d = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements d.h {
        public final Context a;
        public final bb4 b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public ThreadPoolExecutor f;
        public ThreadPoolExecutor g;
        public d.i h;

        public b(Context context, bb4 bb4Var) {
            b78.d(context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = bb4Var;
            this.c = g.d;
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.d) {
                this.h = iVar;
            }
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new wu1("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new Runnable() { // from class: cb4
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.b bVar = this.t;
                            synchronized (bVar.d) {
                                try {
                                    if (bVar.h == null) {
                                        return;
                                    }
                                    try {
                                        rb4 rb4VarC = bVar.c();
                                        int i = rb4VarC.f;
                                        if (i == 2) {
                                            synchronized (bVar.d) {
                                            }
                                        }
                                        if (i != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                        }
                                        try {
                                            Method method = yra.b;
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            g.a aVar = bVar.c;
                                            Context context = bVar.a;
                                            aVar.getClass();
                                            rb4[] rb4VarArr = {rb4VarC};
                                            rza rzaVar = kza.a;
                                            wra.a("TypefaceCompat.createFromFontInfo");
                                            try {
                                                Typeface typefaceB = kza.a.b(context, rb4VarArr, 0);
                                                Trace.endSection();
                                                MappedByteBuffer mappedByteBufferD = sza.d(bVar.a, rb4VarC.a);
                                                if (mappedByteBufferD == null || typefaceB == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    h hVar = new h(typefaceB, nf2.b(mappedByteBufferD));
                                                    Trace.endSection();
                                                    Trace.endSection();
                                                    synchronized (bVar.d) {
                                                        try {
                                                            d.i iVar2 = bVar.h;
                                                            if (iVar2 != null) {
                                                                iVar2.b(hVar);
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                    bVar.b();
                                                } catch (Throwable th2) {
                                                    Method method2 = yra.b;
                                                    Trace.endSection();
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                Trace.endSection();
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            Method method3 = yra.b;
                                            Trace.endSection();
                                            throw th4;
                                        }
                                    } catch (Throwable th5) {
                                        synchronized (bVar.d) {
                                            try {
                                                d.i iVar3 = bVar.h;
                                                if (iVar3 != null) {
                                                    iVar3.a(th5);
                                                }
                                                bVar.b();
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final rb4 c() {
            try {
                a aVar = this.c;
                Context context = this.a;
                bb4 bb4Var = this.b;
                aVar.getClass();
                ArrayList arrayList = new ArrayList(1);
                Object obj = new Object[]{bb4Var}[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                qb4 qb4VarA = ab4.a(context, Collections.unmodifiableList(arrayList));
                int i = qb4VarA.a;
                if (i != 0) {
                    ru3.d(pk.d(i, "fetchFonts failed (", ")"));
                    return null;
                }
                rb4[] rb4VarArr = qb4VarA.b.get(0);
                if (rb4VarArr != null && rb4VarArr.length != 0) {
                    return rb4VarArr[0];
                }
                ru3.d("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                jl.a("provider not found", e);
                return null;
            }
        }
    }
}
