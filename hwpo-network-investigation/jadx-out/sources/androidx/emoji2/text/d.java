package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import defpackage.aa0;
import defpackage.b78;
import defpackage.r30;
import defpackage.ve3;
import defpackage.z2b;
import defpackage.z90;
import defpackage.zu6;
import defpackage.zw9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Object j = new Object();
    public static volatile d k;
    public final ReentrantReadWriteLock a;
    public final r30 b;
    public volatile int c;
    public final Handler d;
    public final a e;
    public final h f;
    public final C0015d g;
    public final int h;
    public final androidx.emoji2.text.b i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends b {
        public volatile androidx.emoji2.text.f b;
        public volatile androidx.emoji2.text.h c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c {
        public final h a;
        public int b = 0;
        public final androidx.emoji2.text.b c = new androidx.emoji2.text.b();

        public c(h hVar) {
            this.a = hVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0015d implements j {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g implements Runnable {
        public final ArrayList t;
        public final int u;

        public g(List list, int i, Throwable th) {
            b78.d(list, "initCallbacks cannot be null");
            this.t = new ArrayList(list);
            this.u = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            if (this.u != 1) {
                while (i < size) {
                    ((f) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) arrayList.get(i)).b();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface h {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface j {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        h hVar = aVar.a;
        this.f = hVar;
        int i2 = aVar.b;
        this.h = i2;
        this.i = aVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new r30(0);
        this.g = new C0015d();
        a aVar2 = new a(this);
        this.e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (j) {
            try {
                dVar = k;
                if (!(dVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i2) {
        if (!(c() == 1)) {
            aa0.c("Not initialized yet");
            return 0;
        }
        b78.d(charSequence, "charSequence cannot be null");
        androidx.emoji2.text.f fVar = this.e.b;
        fVar.getClass();
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ve3[] ve3VarArr = (ve3[]) spanned.getSpans(i2, i2 + 1, ve3.class);
            if (ve3VarArr.length > 0) {
                return spanned.getSpanStart(ve3VarArr[0]);
            }
        }
        return ((androidx.emoji2.text.f.c) fVar.c(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.f.c(i2))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            aa0.c("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            a aVar = this.e;
            d dVar = aVar.a;
            try {
                dVar.f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th) {
                dVar.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:93:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:93:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    public final CharSequence g(int i2, int i3, int i4, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i5;
        int i6;
        ve3[] ve3VarArr;
        int spanStart;
        z2b z2bVar = null;
        if (!(c() == 1)) {
            aa0.c("Not initialized yet");
            return null;
        }
        if (i2 < 0) {
            z90.a("start cannot be negative");
            return null;
        }
        if (i3 < 0) {
            z90.a("end cannot be negative");
            return null;
        }
        b78.b("start should be <= than end", i2 <= i3);
        if (charSequence == null) {
            return null;
        }
        b78.b("start should be < than charSequence length", i2 <= charSequence.length());
        b78.b("end should be < than charSequence length", i3 <= charSequence.length());
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        boolean z = i4 == 1;
        androidx.emoji2.text.f fVar = this.e.b;
        fVar.getClass();
        boolean z2 = charSequence instanceof zw9;
        if (z2) {
            ((zw9) charSequence).a();
        }
        if (z2) {
            z2bVar = new z2b((Spannable) charSequence);
            if (z2bVar != null) {
                for (ve3 ve3Var : ve3VarArr) {
                    spanStart = z2bVar.u.getSpanStart(ve3Var);
                    int spanEnd = z2bVar.u.getSpanEnd(ve3Var);
                    if (spanStart != i3) {
                        z2bVar.removeSpan(ve3Var);
                    }
                    i2 = Math.min(spanStart, i2);
                    i3 = Math.max(spanEnd, i3);
                }
            }
            i5 = i2;
            i6 = i3;
            if (i5 != i6) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((zw9) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    z2bVar = new z2b((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((zw9) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, ve3.class) <= i3) {
                z2bVar = new z2b();
                z2bVar.t = false;
                z2bVar.u = new SpannableString(charSequence);
            }
            if (z2bVar != null && (ve3VarArr = (ve3[]) z2bVar.u.getSpans(i2, i3, ve3.class)) != null && ve3VarArr.length > 0) {
                while (i < r0) {
                    spanStart = z2bVar.u.getSpanStart(ve3Var);
                    int spanEnd2 = z2bVar.u.getSpanEnd(ve3Var);
                    if (spanStart != i3) {
                        z2bVar.removeSpan(ve3Var);
                    }
                    i2 = Math.min(spanStart, i2);
                    i3 = Math.max(spanEnd2, i3);
                }
            }
            i5 = i2;
            i6 = i3;
            if (i5 != i6 || i5 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    z2b z2bVar2 = (z2b) fVar.c(charSequence2, i5, i6, Integer.MAX_VALUE, z, new androidx.emoji2.text.f.a(z2bVar, fVar.a));
                    if (z2bVar2 != null) {
                        Spannable spannable = z2bVar2.u;
                        if (z2) {
                            ((zw9) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((zw9) charSequence2).b();
                    throw th;
                }
            }
            ((zw9) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((zw9) charSequence2).b();
        throw th;
    }

    public final void h(f fVar) {
        b78.d(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new g(Arrays.asList(fVar), this.c, null));
            } else {
                this.b.add(fVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.e;
        aVar.getClass();
        Bundle bundle = editorInfo.extras;
        zu6 zu6Var = aVar.c.a;
        int iA = zu6Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? zu6Var.b.getInt(iA + zu6Var.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }
}
