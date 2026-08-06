package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u13 implements Closeable, Flushable {
    public static final ol8 M = new ol8("[a-z0-9_-]{1,120}");
    public static final String N = "CLEAN";
    public static final String O = "DIRTY";
    public static final String P = "REMOVE";
    public static final String Q = "READ";
    public mi8 A;
    public final LinkedHashMap<String, b> B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public final y9a K;
    public final q13 L;
    public final du7 t;
    public final r13 u;
    public final long v;
    public final du7 w;
    public final du7 x;
    public final du7 y;
    public long z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final b a;
        public final boolean[] b;
        public boolean c;

        public a(b bVar) {
            boolean[] zArr;
            this.a = bVar;
            if (bVar.e) {
                zArr = null;
            } else {
                u13.this.getClass();
                zArr = new boolean[2];
            }
            this.b = zArr;
        }

        public final void a() {
            u13 u13Var = u13.this;
            synchronized (u13Var) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (xj5.a(this.a.g, this)) {
                        u13Var.k(this, false);
                    }
                    this.c = true;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            u13 u13Var = u13.this;
            synchronized (u13Var) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (xj5.a(this.a.g, this)) {
                        u13Var.k(this, true);
                    }
                    this.c = true;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            b bVar = this.a;
            if (xj5.a(bVar.g, this)) {
                u13 u13Var = u13.this;
                if (u13Var.E) {
                    u13Var.k(this, false);
                } else {
                    bVar.f = true;
                }
            }
        }

        public final yq9 d(int i) {
            final u13 u13Var = u13.this;
            synchronized (u13Var) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!xj5.a(this.a.g, this)) {
                        return new vq0();
                    }
                    if (!this.a.e) {
                        boolean[] zArr = this.b;
                        zArr.getClass();
                        zArr[i] = true;
                    }
                    du7 du7Var = (du7) this.a.d.get(i);
                    try {
                        r13 r13Var = u13Var.u;
                        r13Var.getClass();
                        du7Var.getClass();
                        return new st3(r13Var.J(du7Var), new oh4() { // from class: n13
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u13 u13Var2 = u13Var;
                                u13.a aVar = this;
                                ((IOException) obj).getClass();
                                synchronized (u13Var2) {
                                    aVar.c();
                                }
                                return g2b.a;
                            }
                        });
                    } catch (FileNotFoundException unused) {
                        return new vq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public a g;
        public int h;
        public long i;
        public final /* synthetic */ u13 j;

        public b(u13 u13Var, String str) {
            str.getClass();
            this.j = u13Var;
            this.a = str;
            u13Var.getClass();
            this.b = new long[2];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(this.j.t.g(sb.toString()));
                sb.append(".tmp");
                this.d.add(this.j.t.g(sb.toString()));
                sb.setLength(length);
            }
        }

        public final c a() {
            TimeZone timeZone = ytb.a;
            if (!this.e) {
                return null;
            }
            u13 u13Var = this.j;
            if (!u13Var.E && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.b.clone();
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    kw9 kw9VarK = u13Var.u.K((du7) this.c.get(i2));
                    if (!u13Var.E) {
                        this.h++;
                        kw9VarK = new p13(kw9VarK, u13Var, this);
                    }
                    arrayList.add(kw9VarK);
                } catch (FileNotFoundException unused) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        vtb.b((kw9) obj);
                    }
                    try {
                        u13Var.H(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new c(this.j, this.a, this.i, arrayList, jArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements Closeable {
        public final String t;
        public final long u;
        public final ArrayList v;
        public final /* synthetic */ u13 w;

        public c(u13 u13Var, String str, long j, ArrayList arrayList, long[] jArr) {
            str.getClass();
            jArr.getClass();
            this.w = u13Var;
            this.t = str;
            this.u = j;
            this.v = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                vtb.b((kw9) obj);
            }
        }
    }

    public u13(fy3 fy3Var, du7 du7Var, z9a z9aVar) {
        fy3Var.getClass();
        z9aVar.getClass();
        this.t = du7Var;
        this.u = new r13(fy3Var);
        this.v = 10485760L;
        this.B = new LinkedHashMap<>(0, 0.75f, true);
        this.K = z9aVar.d();
        this.L = new q13(this, av.a(new StringBuilder(), ytb.b, " Cache"));
        this.w = du7Var.g("journal");
        this.x = du7Var.g("journal.tmp");
        this.y = du7Var.g("journal.bkp");
    }

    public static void K(String str) {
        if (M.c(str)) {
            return;
        }
        ca0.a(eca.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void B(String str) throws IOException {
        String strSubstring;
        int iT = z2a.t(str, ' ', 0, 6);
        if (iT == -1) {
            o03.a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iT + 1;
        int iT2 = z2a.t(str, ' ', i, 4);
        LinkedHashMap<String, b> linkedHashMap = this.B;
        if (iT2 == -1) {
            strSubstring = str.substring(i);
            String str2 = P;
            if (iT == str2.length() && w2a.n(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iT2);
        }
        b bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iT2 != -1) {
            String str3 = N;
            if (iT == str3.length() && w2a.n(str, str3, false)) {
                List listJ = z2a.J(str.substring(iT2 + 1), new char[]{' '});
                bVar.e = true;
                bVar.g = null;
                int size = listJ.size();
                bVar.j.getClass();
                if (size != 2) {
                    i34.c(listJ, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listJ.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bVar.b[i2] = Long.parseLong((String) listJ.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    i34.c(listJ, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iT2 == -1) {
            String str4 = O;
            if (iT == str4.length() && w2a.n(str, str4, false)) {
                bVar.g = new a(bVar);
                return;
            }
        }
        if (iT2 == -1) {
            String str5 = Q;
            if (iT == str5.length() && w2a.n(str, str5, false)) {
                return;
            }
        }
        o03.a("unexpected journal line: ".concat(str));
    }

    public final synchronized void E() {
        Throwable th;
        try {
            mi8 mi8Var = this.A;
            if (mi8Var != null) {
                mi8Var.close();
            }
            mi8 mi8VarB = ev6.b(this.u.J(this.x));
            try {
                mi8VarB.R("libcore.io.DiskLruCache");
                mi8VarB.writeByte(10);
                mi8VarB.R("1");
                mi8VarB.writeByte(10);
                mi8VarB.o0(201105L);
                mi8VarB.writeByte(10);
                mi8VarB.o0(2L);
                mi8VarB.writeByte(10);
                mi8VarB.writeByte(10);
                for (b bVar : this.B.values()) {
                    bVar.getClass();
                    b bVar2 = bVar;
                    if (bVar2.g != null) {
                        mi8VarB.R(O);
                        mi8VarB.writeByte(32);
                        mi8VarB.R(bVar2.a);
                        mi8VarB.writeByte(10);
                    } else {
                        mi8VarB.R(N);
                        mi8VarB.writeByte(32);
                        mi8VarB.R(bVar2.a);
                        for (long j : bVar2.b) {
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
            boolean zV = this.u.v(this.w);
            r13 r13Var = this.u;
            if (zV) {
                r13Var.k(this.w, this.y);
                this.u.k(this.x, this.w);
                vtb.d(this.u, this.y);
            } else {
                r13Var.k(this.x, this.w);
            }
            mi8 mi8Var2 = this.A;
            if (mi8Var2 != null) {
                vtb.b(mi8Var2);
            }
            r13 r13Var2 = this.u;
            du7 du7Var = this.w;
            r13Var2.getClass();
            du7Var.getClass();
            this.A = new mi8(new st3(r13Var2.h(du7Var), new m13(0, this)));
            this.D = false;
            this.I = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void H(b bVar) {
        mi8 mi8Var;
        String str = bVar.a;
        if (!this.E) {
            if (bVar.h > 0 && (mi8Var = this.A) != null) {
                mi8Var.R(O);
                mi8Var.writeByte(32);
                mi8Var.R(str);
                mi8Var.writeByte(10);
                mi8Var.flush();
            }
            if (bVar.h > 0 || bVar.g != null) {
                bVar.f = true;
                return;
            }
        }
        a aVar = bVar.g;
        if (aVar != null) {
            aVar.c();
        }
        for (int i = 0; i < 2; i++) {
            vtb.d(this.u, (du7) bVar.c.get(i));
            long j = this.z;
            long[] jArr = bVar.b;
            this.z = j - jArr[i];
            jArr[i] = 0;
        }
        this.C++;
        mi8 mi8Var2 = this.A;
        if (mi8Var2 != null) {
            mi8Var2.R(P);
            mi8Var2.writeByte(32);
            mi8Var2.R(str);
            mi8Var2.writeByte(10);
        }
        this.B.remove(str);
        if (u()) {
            this.K.d(this.L, 0L);
        }
    }

    public final void J() {
        while (this.z > this.v) {
            for (b bVar : this.B.values()) {
                bVar.getClass();
                b bVar2 = bVar;
                if (!bVar2.f) {
                    H(bVar2);
                }
            }
            return;
        }
        this.H = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.F && !this.G) {
                Collection<b> collectionValues = this.B.values();
                collectionValues.getClass();
                for (b bVar : (b[]) collectionValues.toArray(new b[0])) {
                    bVar.getClass();
                    a aVar = bVar.g;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                J();
                mi8 mi8Var = this.A;
                if (mi8Var != null) {
                    vtb.b(mi8Var);
                }
                this.A = null;
                this.G = true;
                return;
            }
            this.G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.F) {
            h();
            J();
            mi8 mi8Var = this.A;
            mi8Var.getClass();
            mi8Var.flush();
        }
    }

    public final synchronized void h() {
        if (this.G) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void k(a aVar, boolean z) {
        b bVar = aVar.a;
        if (!xj5.a(bVar.g, aVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !bVar.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = aVar.b;
                zArr.getClass();
                if (!zArr[i]) {
                    aVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.u.v((du7) bVar.d.get(i))) {
                    aVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            du7 du7Var = (du7) bVar.d.get(i2);
            if (!z || bVar.f) {
                vtb.d(this.u, du7Var);
            } else if (this.u.v(du7Var)) {
                du7 du7Var2 = (du7) bVar.c.get(i2);
                this.u.k(du7Var, du7Var2);
                long j = bVar.b[i2];
                Long l = this.u.B(du7Var2).d;
                long jLongValue = l != null ? l.longValue() : 0L;
                bVar.b[i2] = jLongValue;
                this.z = (this.z - j) + jLongValue;
            }
        }
        bVar.g = null;
        if (bVar.f) {
            H(bVar);
            return;
        }
        this.C++;
        mi8 mi8Var = this.A;
        mi8Var.getClass();
        if (bVar.e || z) {
            bVar.e = true;
            mi8Var.R(N);
            mi8Var.writeByte(32);
            mi8Var.R(bVar.a);
            for (long j2 : bVar.b) {
                mi8Var.writeByte(32);
                mi8Var.o0(j2);
            }
            mi8Var.writeByte(10);
            if (z) {
                long j3 = this.J;
                this.J = 1 + j3;
                bVar.i = j3;
            }
        } else {
            this.B.remove(bVar.a);
            mi8Var.R(P);
            mi8Var.writeByte(32);
            mi8Var.R(bVar.a);
            mi8Var.writeByte(10);
        }
        mi8Var.flush();
        if (this.z > this.v || u()) {
            this.K.d(this.L, 0L);
        }
    }

    public final synchronized a m(long j, String str) {
        str.getClass();
        t();
        h();
        K(str);
        b bVar = this.B.get(str);
        if (j != -1 && (bVar == null || bVar.i != j)) {
            return null;
        }
        if ((bVar != null ? bVar.g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.h != 0) {
            return null;
        }
        if (!this.H && !this.I) {
            mi8 mi8Var = this.A;
            mi8Var.getClass();
            mi8Var.R(O);
            mi8Var.writeByte(32);
            mi8Var.R(str);
            mi8Var.writeByte(10);
            mi8Var.flush();
            if (this.D) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, str);
                this.B.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.g = aVar;
            return aVar;
        }
        this.K.d(this.L, 0L);
        return null;
    }

    public final synchronized c p(String str) {
        str.getClass();
        t();
        h();
        K(str);
        b bVar = this.B.get(str);
        if (bVar == null) {
            return null;
        }
        c cVarA = bVar.a();
        if (cVarA == null) {
            return null;
        }
        this.C++;
        mi8 mi8Var = this.A;
        mi8Var.getClass();
        mi8Var.R(Q);
        mi8Var.writeByte(32);
        mi8Var.R(str);
        mi8Var.writeByte(10);
        if (u()) {
            this.K.d(this.L, 0L);
        }
        return cVarA;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067 A[Catch: all -> 0x0027, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:39:0x006d, B:41:0x0079, B:51:0x00bc, B:45:0x0084, B:47:0x00b5, B:49:0x00b9, B:50:0x00bb, B:38:0x0067, B:54:0x00c3, B:35:0x0061, B:32:0x005c, B:46:0x00ab, B:19:0x0041, B:23:0x004d), top: B:64:0x0003, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:39:0x006d, B:41:0x0079, B:51:0x00bc, B:45:0x0084, B:47:0x00b5, B:49:0x00b9, B:50:0x00bb, B:38:0x0067, B:54:0x00c3, B:35:0x0061, B:32:0x005c, B:46:0x00ab, B:19:0x0041, B:23:0x004d), top: B:64:0x0003, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void t() {
        boolean z;
        try {
            TimeZone timeZone = ytb.a;
            if (this.F) {
                return;
            }
            if (this.u.v(this.y)) {
                boolean zV = this.u.v(this.w);
                r13 r13Var = this.u;
                du7 du7Var = this.y;
                if (zV) {
                    r13Var.u(du7Var);
                } else {
                    r13Var.k(du7Var, this.w);
                }
            }
            r13 r13Var2 = this.u;
            du7 du7Var2 = this.y;
            byte[] bArr = vtb.a;
            r13Var2.getClass();
            du7Var2.getClass();
            yq9 yq9VarJ = r13Var2.J(du7Var2);
            try {
                try {
                    r13Var2.u.t(du7Var2);
                    if (yq9VarJ != null) {
                        try {
                            yq9VarJ.close();
                        } catch (Throwable unused) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (yq9VarJ != null) {
                        try {
                            yq9VarJ.close();
                        } catch (Throwable th2) {
                            fn3.b(th, th2);
                        }
                    }
                    th = th;
                    if (th != null) {
                        throw th;
                    }
                    r13Var2.u.t(du7Var2);
                    z = false;
                    this.E = z;
                    if (this.u.v(this.w)) {
                        try {
                            y();
                            v();
                            this.F = true;
                            return;
                        } catch (IOException e) {
                            okhttp3.internal.platform.c cVar = okhttp3.internal.platform.c.a;
                            okhttp3.internal.platform.c.a.j("DiskLruCache " + this.t + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                            try {
                                close();
                                vtb.c(this.u, this.t);
                                this.G = false;
                                E();
                                this.F = true;
                            } catch (Throwable th3) {
                                this.G = false;
                                throw th3;
                            }
                        }
                    }
                    E();
                    this.F = true;
                }
            } catch (IOException unused2) {
                g2b g2bVar = g2b.a;
                if (yq9VarJ != null) {
                    try {
                        yq9VarJ.close();
                    } catch (Throwable th4) {
                        th = th4;
                        if (th != null) {
                            throw th;
                        }
                        r13Var2.u.t(du7Var2);
                        z = false;
                        this.E = z;
                        if (this.u.v(this.w)) {
                            y();
                            v();
                            this.F = true;
                            return;
                        }
                        E();
                        this.F = true;
                    }
                }
                th = null;
                if (th != null) {
                    throw th;
                }
                r13Var2.u.t(du7Var2);
                z = false;
            }
            this.E = z;
            if (this.u.v(this.w)) {
                y();
                v();
                this.F = true;
                return;
            }
            E();
            this.F = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean u() {
        int i = this.C;
        return i >= 2000 && i >= this.B.size();
    }

    public final void v() {
        du7 du7Var = this.x;
        r13 r13Var = this.u;
        vtb.d(r13Var, du7Var);
        Iterator<b> it = this.B.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            next.getClass();
            b bVar = next;
            int i = 0;
            if (bVar.g == null) {
                while (i < 2) {
                    this.z += bVar.b[i];
                    i++;
                }
            } else {
                bVar.g = null;
                while (i < 2) {
                    vtb.d(r13Var, (du7) bVar.c.get(i));
                    vtb.d(r13Var, (du7) bVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void y() throws Throwable {
        r13 r13Var = this.u;
        du7 du7Var = this.w;
        kw9 kw9VarK = r13Var.K(du7Var);
        kw9VarK.getClass();
        ni8 ni8Var = new ni8(kw9VarK);
        try {
            String strI = ni8Var.I(Long.MAX_VALUE);
            String strI2 = ni8Var.I(Long.MAX_VALUE);
            String strI3 = ni8Var.I(Long.MAX_VALUE);
            String strI4 = ni8Var.I(Long.MAX_VALUE);
            String strI5 = ni8Var.I(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strI) || !"1".equals(strI2) || !xj5.a(String.valueOf(201105), strI3) || !xj5.a(String.valueOf(2), strI4) || strI5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strI + ", " + strI2 + ", " + strI4 + ", " + strI5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    B(ni8Var.I(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.C = i - this.B.size();
                    if (ni8Var.z()) {
                        mi8 mi8Var = this.A;
                        if (mi8Var != null) {
                            vtb.b(mi8Var);
                        }
                        r13Var.getClass();
                        du7Var.getClass();
                        this.A = new mi8(new st3(r13Var.h(du7Var), new m13(0, this)));
                    } else {
                        E();
                    }
                    g2b g2bVar = g2b.a;
                    try {
                        ni8Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                ni8Var.close();
            } catch (Throwable th3) {
                fn3.b(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }
}
