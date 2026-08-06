package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rq2 implements if2 {
    public final Context a;
    public final ArrayList b;
    public final if2 c;
    public kw3 d;
    public p40 e;
    public az1 f;
    public if2 g;
    public i1b h;
    public gf2 i;
    public zh8 j;
    public if2 k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements if2.a {
        public final Context a;
        public final qr2.a b;

        public a(Context context) {
            qr2.a aVar = new qr2.a();
            this.a = context.getApplicationContext();
            this.b = aVar;
        }

        @Override // if2.a
        public final if2 a() {
            return new rq2(this.a, this.b.a());
        }
    }

    public rq2(Context context, if2 if2Var) {
        this.a = context.getApplicationContext();
        if2Var.getClass();
        this.c = if2Var;
        this.b = new ArrayList();
    }

    public static void p(if2 if2Var, yua yuaVar) {
        if (if2Var != null) {
            if2Var.d(yuaVar);
        }
    }

    @Override // defpackage.if2
    public final long c(of2 of2Var) {
        xl7.r(this.k == null);
        Uri uri = of2Var.a;
        String scheme = uri.getScheme();
        String str = n6b.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    kw3 kw3Var = new kw3(false);
                    this.d = kw3Var;
                    o(kw3Var);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    p40 p40Var = new p40(context);
                    this.e = p40Var;
                    o(p40Var);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                p40 p40Var2 = new p40(context);
                this.e = p40Var2;
                o(p40Var2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                az1 az1Var = new az1(context);
                this.f = az1Var;
                o(az1Var);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            if2 if2Var = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        if2 if2Var2 = (if2) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = if2Var2;
                        o(if2Var2);
                    } catch (ClassNotFoundException unused) {
                        md6.g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        jl.a("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.g == null) {
                        this.g = if2Var;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    i1b i1bVar = new i1b();
                    this.h = i1bVar;
                    o(i1bVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    gf2 gf2Var = new gf2(false);
                    this.i = gf2Var;
                    o(gf2Var);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    zh8 zh8Var = new zh8(context);
                    this.j = zh8Var;
                    o(zh8Var);
                }
                this.k = this.j;
            } else {
                this.k = if2Var;
            }
        }
        return this.k.c(of2Var);
    }

    @Override // defpackage.if2
    public final void close() {
        if2 if2Var = this.k;
        if (if2Var != null) {
            try {
                if2Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.if2
    public final void d(yua yuaVar) {
        yuaVar.getClass();
        this.c.d(yuaVar);
        this.b.add(yuaVar);
        p(this.d, yuaVar);
        p(this.e, yuaVar);
        p(this.f, yuaVar);
        p(this.g, yuaVar);
        p(this.h, yuaVar);
        p(this.i, yuaVar);
        p(this.j, yuaVar);
    }

    @Override // defpackage.if2
    public final Uri getUri() {
        if2 if2Var = this.k;
        if (if2Var == null) {
            return null;
        }
        return if2Var.getUri();
    }

    @Override // defpackage.if2
    public final Map<String, List<String>> k() {
        if2 if2Var = this.k;
        return if2Var == null ? Collections.EMPTY_MAP : if2Var.k();
    }

    public final void o(if2 if2Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            if2Var.d((yua) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) {
        if2 if2Var = this.k;
        if2Var.getClass();
        return if2Var.read(bArr, i, i2);
    }
}
