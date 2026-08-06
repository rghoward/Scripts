package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o13 implements Closeable, Flushable {
    public static final ol8 J = new ol8("[a-z0-9_-]{1,120}");
    public long A;
    public int B;
    public mi8 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final s13 I;
    public final du7 t;
    public final long u;
    public final du7 v;
    public final du7 w;
    public final du7 x;
    public final LinkedHashMap<String, b> y;
    public final o02 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final b a;
        public boolean b;
        public final boolean[] c = new boolean[2];

        public a(b bVar) {
            this.a = bVar;
        }

        public final void a(boolean z) {
            o13 o13Var = o13.this;
            synchronized (o13Var) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (xj5.a(this.a.g, this)) {
                        o13.h(o13Var, this, z);
                    }
                    this.b = true;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final du7 b(int i) {
            du7 du7Var;
            o13 o13Var = o13.this;
            synchronized (o13Var) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                du7 du7Var2 = this.a.d.get(i);
                s13 s13Var = o13Var.I;
                du7 du7Var3 = du7Var2;
                if (!s13Var.v(du7Var3)) {
                    v.a(s13Var.J(du7Var3));
                }
                du7Var = du7Var2;
            }
            return du7Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b {
        public final String a;
        public final long[] b = new long[2];
        public final ArrayList<du7> c = new ArrayList<>(2);
        public final ArrayList<du7> d = new ArrayList<>(2);
        public boolean e;
        public boolean f;
        public a g;
        public int h;

        public b(String str) {
            this.a = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(o13.this.t.g(sb.toString()));
                sb.append(".tmp");
                this.d.add(o13.this.t.g(sb.toString()));
                sb.setLength(length);
            }
        }

        public final c a() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList<du7> arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                o13 o13Var = o13.this;
                if (i >= size) {
                    this.h++;
                    return o13Var.new c(this);
                }
                if (!o13Var.I.v(arrayList.get(i))) {
                    try {
                        o13Var.B(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements Closeable {
        public final b t;
        public boolean u;

        public c(b bVar) {
            this.t = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.u) {
                return;
            }
            this.u = true;
            o13 o13Var = o13.this;
            synchronized (o13Var) {
                try {
                    b bVar = this.t;
                    int i = bVar.h - 1;
                    bVar.h = i;
                    if (i == 0 && bVar.f) {
                        ol8 ol8Var = o13.J;
                        o13Var.B(bVar);
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public d(r02<? super d> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return o13.this.new d(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            o13 o13Var = o13.this;
            synchronized (o13Var) {
                try {
                    if (!o13Var.E || o13Var.F) {
                        return g2b.a;
                    }
                    try {
                        o13Var.E();
                    } catch (IOException unused) {
                        o13Var.G = true;
                    }
                    try {
                        if (o13Var.B >= 2000) {
                            o13Var.J();
                        }
                    } catch (IOException unused2) {
                        o13Var.H = true;
                        o13Var.C = new mi8(new vq0());
                    }
                    return g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public o13(long j, n72 n72Var, fy3 fy3Var, du7 du7Var) {
        this.t = du7Var;
        this.u = j;
        if (j <= 0) {
            z90.a("maxSize <= 0");
            throw null;
        }
        this.v = du7Var.g("journal");
        this.w = du7Var.g("journal.tmp");
        this.x = du7Var.g("journal.bkp");
        this.y = new LinkedHashMap<>(0, 0.75f, true);
        this.z = u72.a(h72.a.C0100a.c(od3.b(), n72Var.w0(1)));
        this.I = new s13(fy3Var);
    }

    public static void H(String str) {
        if (J.c(str)) {
            return;
        }
        ca0.a(eca.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0113 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:23:0x003a, B:26:0x0054, B:30:0x006d, B:32:0x007b, B:34:0x0082, B:27:0x0058, B:29:0x0066, B:38:0x00a2, B:40:0x00a9, B:43:0x00ae, B:45:0x00bf, B:48:0x00c4, B:53:0x00ff, B:55:0x010a, B:59:0x0113, B:49:0x00dc, B:51:0x00f1, B:52:0x00fc, B:37:0x0092, B:62:0x0118, B:63:0x011f), top: B:66:0x0001 }] */
    public static final void h(o13 o13Var, a aVar, boolean z) {
        synchronized (o13Var) {
            b bVar = aVar.a;
            if (!xj5.a(bVar.g, aVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || bVar.f) {
                for (int i = 0; i < 2; i++) {
                    o13Var.I.u(bVar.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (aVar.c[i2] && !o13Var.I.v(bVar.d.get(i2))) {
                        aVar.a(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    du7 du7Var = bVar.d.get(i3);
                    du7 du7Var2 = bVar.c.get(i3);
                    boolean zV = o13Var.I.v(du7Var);
                    s13 s13Var = o13Var.I;
                    if (zV) {
                        s13Var.k(du7Var, du7Var2);
                    } else {
                        du7 du7Var3 = bVar.c.get(i3);
                        if (!s13Var.v(du7Var3)) {
                            v.a(s13Var.J(du7Var3));
                        }
                    }
                    long j = bVar.b[i3];
                    Long l = o13Var.I.B(du7Var2).d;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    bVar.b[i3] = jLongValue;
                    o13Var.A = (o13Var.A - j) + jLongValue;
                }
            }
            bVar.g = null;
            if (bVar.f) {
                o13Var.B(bVar);
                return;
            }
            o13Var.B++;
            mi8 mi8Var = o13Var.C;
            mi8Var.getClass();
            if (z || bVar.e) {
                bVar.e = true;
                mi8Var.R("CLEAN");
                mi8Var.writeByte(32);
                mi8Var.R(bVar.a);
                for (long j2 : bVar.b) {
                    mi8Var.writeByte(32);
                    mi8Var.o0(j2);
                }
                mi8Var.writeByte(10);
            } else {
                o13Var.y.remove(bVar.a);
                mi8Var.R("REMOVE");
                mi8Var.writeByte(32);
                mi8Var.R(bVar.a);
                mi8Var.writeByte(10);
            }
            mi8Var.flush();
            if (o13Var.A > o13Var.u) {
                o13Var.t();
            } else if (o13Var.B >= 2000) {
                o13Var.t();
            }
        }
    }

    public final void B(b bVar) {
        mi8 mi8Var;
        int i = bVar.h;
        String str = bVar.a;
        if (i > 0 && (mi8Var = this.C) != null) {
            mi8Var.R("DIRTY");
            mi8Var.writeByte(32);
            mi8Var.R(str);
            mi8Var.writeByte(10);
            mi8Var.flush();
        }
        if (bVar.h > 0 || bVar.g != null) {
            bVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.I.u(bVar.c.get(i2));
            long j = this.A;
            long[] jArr = bVar.b;
            this.A = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.B++;
        mi8 mi8Var2 = this.C;
        if (mi8Var2 != null) {
            mi8Var2.R("REMOVE");
            mi8Var2.writeByte(32);
            mi8Var2.R(str);
            mi8Var2.writeByte(10);
        }
        this.y.remove(str);
        if (this.B >= 2000) {
            t();
        }
    }

    public final void E() {
        while (this.A > this.u) {
            for (b bVar : this.y.values()) {
                if (!bVar.f) {
                    B(bVar);
                }
            }
            return;
        }
        this.G = false;
    }

    public final synchronized void J() {
        Throwable th;
        try {
            mi8 mi8Var = this.C;
            if (mi8Var != null) {
                mi8Var.close();
            }
            mi8 mi8VarB = ev6.b(this.I.J(this.w));
            try {
                mi8VarB.R("libcore.io.DiskLruCache");
                mi8VarB.writeByte(10);
                mi8VarB.R("1");
                mi8VarB.writeByte(10);
                mi8VarB.o0(1L);
                mi8VarB.writeByte(10);
                mi8VarB.o0(2L);
                mi8VarB.writeByte(10);
                mi8VarB.writeByte(10);
                for (b bVar : this.y.values()) {
                    if (bVar.g != null) {
                        mi8VarB.R("DIRTY");
                        mi8VarB.writeByte(32);
                        mi8VarB.R(bVar.a);
                        mi8VarB.writeByte(10);
                    } else {
                        mi8VarB.R("CLEAN");
                        mi8VarB.writeByte(32);
                        mi8VarB.R(bVar.a);
                        for (long j : bVar.b) {
                            mi8VarB.writeByte(32);
                            mi8VarB.o0(j);
                        }
                        mi8VarB.writeByte(10);
                    }
                }
                g2b g2bVar = g2b.a;
                try {
                    mi8VarB.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    mi8VarB.close();
                } catch (Throwable th4) {
                    fn3.b(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zV = this.I.v(this.v);
            s13 s13Var = this.I;
            if (zV) {
                s13Var.k(this.v, this.x);
                this.I.k(this.w, this.v);
                this.I.u(this.x);
            } else {
                s13Var.k(this.w, this.v);
            }
            s13 s13Var2 = this.I;
            du7 du7Var = this.v;
            s13Var2.getClass();
            du7Var.getClass();
            this.C = new mi8(new tt3(s13Var2.h(du7Var), new yt0(2, this)));
            this.B = 0;
            this.D = false;
            this.H = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.E && !this.F) {
                for (b bVar : (b[]) this.y.values().toArray(new b[0])) {
                    a aVar = bVar.g;
                    if (aVar != null) {
                        b bVar2 = aVar.a;
                        if (xj5.a(bVar2.g, aVar)) {
                            bVar2.f = true;
                        }
                    }
                }
                E();
                u72.c(this.z, null);
                mi8 mi8Var = this.C;
                mi8Var.getClass();
                mi8Var.close();
                this.C = null;
                this.F = true;
                return;
            }
            this.F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.E) {
            if (this.F) {
                throw new IllegalStateException("cache is closed");
            }
            E();
            mi8 mi8Var = this.C;
            mi8Var.getClass();
            mi8Var.flush();
        }
    }

    public final synchronized a k(String str) {
        if (this.F) {
            throw new IllegalStateException("cache is closed");
        }
        H(str);
        p();
        b bVar = this.y.get(str);
        if ((bVar != null ? bVar.g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.h != 0) {
            return null;
        }
        if (!this.G && !this.H) {
            mi8 mi8Var = this.C;
            mi8Var.getClass();
            mi8Var.R("DIRTY");
            mi8Var.writeByte(32);
            mi8Var.R(str);
            mi8Var.writeByte(10);
            mi8Var.flush();
            if (this.D) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(str);
                this.y.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.g = aVar;
            return aVar;
        }
        t();
        return null;
    }

    public final synchronized c m(String str) {
        c cVarA;
        if (this.F) {
            throw new IllegalStateException("cache is closed");
        }
        H(str);
        p();
        b bVar = this.y.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z = true;
            this.B++;
            mi8 mi8Var = this.C;
            mi8Var.getClass();
            mi8Var.R("READ");
            mi8Var.writeByte(32);
            mi8Var.R(str);
            mi8Var.writeByte(10);
            if (this.B < 2000) {
                z = false;
            }
            if (z) {
                t();
            }
            return cVarA;
        }
        return null;
    }

    public final synchronized void p() {
        try {
            if (this.E) {
                return;
            }
            this.I.u(this.w);
            if (this.I.v(this.x)) {
                boolean zV = this.I.v(this.v);
                s13 s13Var = this.I;
                du7 du7Var = this.x;
                if (zV) {
                    s13Var.u(du7Var);
                } else {
                    s13Var.k(du7Var, this.v);
                }
            }
            if (this.I.v(this.v)) {
                try {
                    v();
                    u();
                    this.E = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        f.a(this.I, this.t);
                        this.F = false;
                        J();
                        this.E = true;
                    } catch (Throwable th) {
                        this.F = false;
                        throw th;
                    }
                }
            }
            J();
            this.E = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void t() {
        oy0.d(this.z, null, null, new d(null), 3);
    }

    public final void u() {
        Iterator<b> it = this.y.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.g == null) {
                while (i < 2) {
                    j += next.b[i];
                    i++;
                }
            } else {
                next.g = null;
                while (i < 2) {
                    du7 du7Var = next.c.get(i);
                    s13 s13Var = this.I;
                    s13Var.u(du7Var);
                    s13Var.u(next.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.A = j;
    }

    public final void v() throws Throwable {
        s13 s13Var = this.I;
        du7 du7Var = this.v;
        kw9 kw9VarK = s13Var.K(du7Var);
        kw9VarK.getClass();
        ni8 ni8Var = new ni8(kw9VarK);
        try {
            String strI = ni8Var.I(Long.MAX_VALUE);
            String strI2 = ni8Var.I(Long.MAX_VALUE);
            String strI3 = ni8Var.I(Long.MAX_VALUE);
            String strI4 = ni8Var.I(Long.MAX_VALUE);
            String strI5 = ni8Var.I(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(strI) && "1".equals(strI2) && xj5.a(String.valueOf(1), strI3)) {
                int i = 2;
                if (xj5.a(String.valueOf(2), strI4) && strI5.length() <= 0) {
                    int i2 = 0;
                    while (true) {
                        try {
                            y(ni8Var.I(Long.MAX_VALUE));
                            i2++;
                        } catch (EOFException unused) {
                            this.B = i2 - this.y.size();
                            if (ni8Var.z()) {
                                s13Var.getClass();
                                du7Var.getClass();
                                this.C = new mi8(new tt3(s13Var.h(du7Var), new yt0(i, this)));
                            } else {
                                J();
                            }
                            g2b g2bVar = g2b.a;
                            try {
                                ni8Var.close();
                                th = null;
                            } catch (Throwable th) {
                                th = th;
                            }
                            if (th != null) {
                                throw th;
                            }
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strI + ", " + strI2 + ", " + strI3 + ", " + strI4 + ", " + strI5 + ']');
        } catch (Throwable th2) {
            th = th2;
            try {
                ni8Var.close();
            } catch (Throwable th3) {
                fn3.b(th, th3);
            }
        }
    }

    public final void y(String str) throws IOException {
        String strSubstring;
        int iT = z2a.t(str, ' ', 0, 6);
        if (iT == -1) {
            o03.a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iT + 1;
        int iT2 = z2a.t(str, ' ', i, 4);
        LinkedHashMap<String, b> linkedHashMap = this.y;
        if (iT2 == -1) {
            strSubstring = str.substring(i);
            if (iT == 6 && w2a.n(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iT2);
        }
        b bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = bVar;
        if (iT2 == -1 || iT != 5 || !w2a.n(str, "CLEAN", false)) {
            if (iT2 == -1 && iT == 5 && w2a.n(str, "DIRTY", false)) {
                bVar2.g = new a(bVar2);
                return;
            } else {
                if (iT2 == -1 && iT == 4 && w2a.n(str, "READ", false)) {
                    return;
                }
                o03.a("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listJ = z2a.J(str.substring(iT2 + 1), new char[]{' '});
        bVar2.e = true;
        bVar2.g = null;
        if (listJ.size() != 2) {
            i34.c(listJ, "unexpected journal line: ");
            return;
        }
        try {
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                bVar2.b[i2] = Long.parseLong((String) listJ.get(i2));
            }
        } catch (NumberFormatException unused) {
            i34.c(listJ, "unexpected journal line: ");
        }
    }
}
