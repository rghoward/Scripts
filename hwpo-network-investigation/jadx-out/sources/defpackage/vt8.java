package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vt8 extends fy3 {
    public static final du7 x;
    public final ClassLoader u;
    public final fy3 v;
    public final o7a w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final boolean a(du7 du7Var) {
            du7 du7Var2 = vt8.x;
            g01 g01VarT = du7Var.t;
            int iN = g01.n(g01VarT, o.a);
            if (iN == -1) {
                iN = g01.n(du7Var.t, o.b);
            }
            if (iN != -1) {
                g01VarT = g01.t(g01VarT, iN + 1, 0, 2);
            } else if (du7Var.h() != null && g01VarT.g() == 2) {
                g01VarT = g01.w;
            }
            return !w2a.h(g01VarT.w(), ".class", true);
        }
    }

    static {
        String str = du7.u;
        x = du7.a.a(AgentHeaderCreator.AGENT_DIVIDER);
    }

    public vt8(ClassLoader classLoader) {
        tn5 tn5Var = fy3.t;
        tn5Var.getClass();
        this.u = classLoader;
        this.v = tn5Var;
        this.w = new o7a(new mh4() { // from class: ut8
            /* JADX WARN: Code duplicated, block: B:118:0x027a A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #12 {all -> 0x0216, blocks: (B:19:0x00bd, B:21:0x00cc, B:22:0x00d5, B:32:0x0137, B:34:0x0141, B:86:0x0215, B:82:0x020c, B:89:0x021a, B:118:0x027a, B:124:0x029b, B:115:0x0274, B:130:0x02a6, B:133:0x02b6, B:134:0x02bd, B:135:0x02be, B:136:0x02c1, B:137:0x02c2, B:138:0x02d7, B:79:0x0205, B:112:0x026d, B:35:0x014a, B:37:0x0153, B:40:0x0164, B:69:0x01f2, B:65:0x01eb, B:72:0x01f6, B:73:0x01fb, B:74:0x01fc, B:62:0x01e4, B:23:0x00e0, B:25:0x00e9, B:31:0x0115, B:127:0x029e, B:128:0x02a3), top: B:170:0x00bd, inners: #7, #10, #11, #13 }] */
            /* JADX WARN: Code duplicated, block: B:122:0x0291  */
            /* JADX WARN: Code duplicated, block: B:148:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:194:0x029b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:197:0x0294 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:203:? A[SYNTHETIC] */
            @Override // defpackage.mh4
            public final Object invoke() throws IOException {
                int iX;
                ArrayList arrayList;
                ni8 ni8Var;
                Throwable th;
                js7 js7Var;
                Throwable th2;
                Throwable th3;
                Throwable th4;
                js7 js7Var2;
                vt8 vt8Var = this.t;
                ClassLoader classLoader2 = vt8Var.u;
                fy3 fy3Var = vt8Var.v;
                Enumeration<URL> resources = classLoader2.getResources(BuildConfig.FLAVOR);
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (i < size) {
                    Object obj = list.get(i);
                    i++;
                    URL url = (URL) obj;
                    url.getClass();
                    if (xj5.a(url.getProtocol(), "file")) {
                        String str = du7.u;
                        js7Var2 = new js7(fy3Var, du7.a.b(new File(url.toURI())));
                    } else {
                        js7Var2 = null;
                    }
                    if (js7Var2 != null) {
                        arrayList2.add(js7Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader2.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    int i3 = i2 + 1;
                    URL url2 = (URL) list2.get(i2);
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    if (w2a.n(string, "jar:file:", z) && (iX = z2a.x(6, string, "!")) != -1) {
                        String str2 = du7.u;
                        du7 du7VarB = du7.a.b(new File(URI.create(string.substring(4, iX))));
                        fy3Var.getClass();
                        zw3 zw3VarH = fy3Var.H(du7VarB);
                        try {
                            long size3 = zw3VarH.size();
                            long j = size3 - 22;
                            long j2 = 0;
                            if (j < 0) {
                                throw new IOException("not a zip: size=" + zw3VarH.size());
                            }
                            long jMax = Math.max(size3 - 65558, 0L);
                            while (true) {
                                long j3 = j2;
                                ni8 ni8Var2 = new ni8(zw3VarH.p(j));
                                try {
                                    if (ni8Var2.m() == 101010256) {
                                        int iT = ni8Var2.t() & 65535;
                                        int iT2 = ni8Var2.t() & 65535;
                                        long jT = ni8Var2.t() & 65535;
                                        arrayList = list2;
                                        if (jT != (ni8Var2.t() & 65535) || iT != 0 || iT2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        ni8Var2.skip(4L);
                                        long jM = ((long) ni8Var2.m()) & 4294967295L;
                                        int iT3 = ni8Var2.t() & 65535;
                                        sl3 sl3Var = new sl3(jT, iT3, jM);
                                        ni8Var2.u(iT3);
                                        ni8Var2.close();
                                        long j4 = j - 20;
                                        if (j4 > j3) {
                                            ni8 ni8Var3 = new ni8(zw3VarH.p(j4));
                                            try {
                                                if (ni8Var3.m() == 117853008) {
                                                    int iM = ni8Var3.m();
                                                    long jP = ni8Var3.p();
                                                    if (ni8Var3.m() != 1 || iM != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    ni8 ni8Var4 = new ni8(zw3VarH.p(jP));
                                                    try {
                                                        int iM2 = ni8Var4.m();
                                                        if (iM2 != 101075792) {
                                                            throw new IOException("bad zip: expected " + otb.b(101075792) + " but was " + otb.b(iM2));
                                                        }
                                                        ni8Var4.skip(12L);
                                                        int iM3 = ni8Var4.m();
                                                        int iM4 = ni8Var4.m();
                                                        long jP2 = ni8Var4.p();
                                                        if (jP2 != ni8Var4.p() || iM3 != 0 || iM4 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        ni8Var4.skip(8L);
                                                        sl3 sl3Var2 = new sl3(jP2, iT3, ni8Var4.p());
                                                        try {
                                                            g2b g2bVar = g2b.a;
                                                            try {
                                                                ni8Var4.close();
                                                                th4 = null;
                                                            } catch (Throwable th5) {
                                                                th4 = th5;
                                                            }
                                                            sl3Var = sl3Var2;
                                                        } catch (Throwable th6) {
                                                            th3 = th6;
                                                            sl3Var = sl3Var2;
                                                            try {
                                                                ni8Var4.close();
                                                                g2b g2bVar2 = g2b.a;
                                                            } catch (Throwable th7) {
                                                                fn3.b(th3, th7);
                                                            }
                                                            th4 = th3;
                                                        }
                                                        if (th4 != null) {
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th3 = th8;
                                                    }
                                                }
                                                g2b g2bVar3 = g2b.a;
                                                try {
                                                    ni8Var3.close();
                                                    th2 = null;
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                }
                                            } catch (Throwable th10) {
                                                try {
                                                    ni8Var3.close();
                                                    g2b g2bVar4 = g2b.a;
                                                } catch (Throwable th11) {
                                                    fn3.b(th10, th11);
                                                }
                                                th2 = th10;
                                            }
                                            if (th2 != null) {
                                                throw th2;
                                            }
                                        }
                                        sl3 sl3Var3 = sl3Var;
                                        ArrayList arrayList4 = new ArrayList();
                                        ni8 ni8Var5 = new ni8(zw3VarH.p(sl3Var3.b));
                                        try {
                                            long j5 = sl3Var3.a;
                                            while (j3 < j5) {
                                                itb itbVarC = otb.c(ni8Var5);
                                                ni8Var = ni8Var5;
                                                try {
                                                    if (itbVarC.h >= sl3Var3.b) {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                    du7 du7Var = vt8.x;
                                                    if (vt8.a.a(itbVarC.a)) {
                                                        arrayList4.add(itbVarC);
                                                    }
                                                    j3++;
                                                    ni8Var5 = ni8Var;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    Throwable th13 = th;
                                                    try {
                                                        ni8Var.close();
                                                        g2b g2bVar5 = g2b.a;
                                                    } catch (Throwable th14) {
                                                        fn3.b(th13, th14);
                                                    }
                                                    th = th13;
                                                    if (th == null) {
                                                        throw th;
                                                    }
                                                    jtb jtbVar = new jtb(du7VarB, fy3Var, otb.a(arrayList4));
                                                    try {
                                                        zw3VarH.close();
                                                        g2b g2bVar6 = g2b.a;
                                                    } catch (Throwable unused) {
                                                    }
                                                    js7Var = new js7(jtbVar, vt8.x);
                                                    if (js7Var != null) {
                                                        arrayList3.add(js7Var);
                                                    }
                                                    i2 = i3;
                                                    size2 = size2;
                                                    list2 = arrayList;
                                                    z = false;
                                                }
                                            }
                                            ni8 ni8Var6 = ni8Var5;
                                            g2b g2bVar7 = g2b.a;
                                            try {
                                                ni8Var6.close();
                                                th = null;
                                            } catch (Throwable th15) {
                                                th = th15;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            ni8Var = ni8Var5;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        jtb jtbVar2 = new jtb(du7VarB, fy3Var, otb.a(arrayList4));
                                        zw3VarH.close();
                                        g2b g2bVar8 = g2b.a;
                                        js7Var = new js7(jtbVar2, vt8.x);
                                        break;
                                        if (zw3VarH != null) {
                                            throw th;
                                        }
                                        try {
                                            zw3VarH.close();
                                            g2b g2bVar9 = g2b.a;
                                            throw th;
                                        } catch (Throwable th17) {
                                            fn3.b(th, th17);
                                            throw th;
                                        }
                                    }
                                    ArrayList arrayList5 = list2;
                                    ni8Var2.close();
                                    j--;
                                    if (j < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    j2 = j3;
                                    list2 = arrayList5;
                                } catch (Throwable th18) {
                                    ni8Var2.close();
                                    throw th18;
                                }
                            }
                        } catch (Throwable th19) {
                            if (zw3VarH != null) {
                                throw th19;
                            }
                            zw3VarH.close();
                            g2b g2bVar10 = g2b.a;
                            throw th19;
                        }
                    } else {
                        arrayList = list2;
                        js7Var = null;
                    }
                    if (js7Var != null) {
                        arrayList3.add(js7Var);
                    }
                    i2 = i3;
                    size2 = size2;
                    list2 = arrayList;
                    z = false;
                }
                return th1.K(arrayList2, arrayList3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fy3
    public final hx3 E(du7 du7Var) {
        du7Var.getClass();
        if (!a.a(du7Var)) {
            return null;
        }
        du7 du7Var2 = x;
        du7Var2.getClass();
        String strW = o.b(du7Var2, du7Var, true).f(du7Var2).t.w();
        for (js7 js7Var : (List) this.w.getValue()) {
            hx3 hx3VarE = ((fy3) js7Var.t).E(((du7) js7Var.u).g(strW));
            if (hx3VarE != null) {
                return hx3VarE;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fy3
    public final zw3 H(du7 du7Var) throws FileNotFoundException {
        du7Var.getClass();
        if (!a.a(du7Var)) {
            fk.a(du7Var, "file not found: ");
            return null;
        }
        du7 du7Var2 = x;
        du7Var2.getClass();
        String strW = o.b(du7Var2, du7Var, true).f(du7Var2).t.w();
        Iterator it = ((List) this.w.getValue()).iterator();
        while (it.hasNext()) {
            js7 js7Var = (js7) it.next();
            try {
                return ((fy3) js7Var.t).H(((du7) js7Var.u).g(strW));
            } catch (FileNotFoundException unused) {
            }
        }
        fk.a(du7Var, "file not found: ");
        return null;
    }

    @Override // defpackage.fy3
    public final yq9 J(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.fy3
    public final kw9 K(du7 du7Var) throws IOException {
        du7Var.getClass();
        if (!a.a(du7Var)) {
            fk.a(du7Var, "file not found: ");
            return null;
        }
        du7 du7Var2 = x;
        du7Var2.getClass();
        URL resource = this.u.getResource(o.b(du7Var2, du7Var, false).f(du7Var2).t.w());
        if (resource == null) {
            fk.a(du7Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return ev6.c(inputStream);
    }

    @Override // defpackage.fy3
    public final yq9 h(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.fy3
    public final void k(du7 du7Var, du7 du7Var2) throws IOException {
        du7Var.getClass();
        du7Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.fy3
    public final void p(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.fy3
    public final void t(du7 du7Var) throws IOException {
        du7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fy3
    public final List<du7> y(du7 du7Var) throws FileNotFoundException {
        du7Var.getClass();
        du7 du7Var2 = x;
        du7Var2.getClass();
        String strW = o.b(du7Var2, du7Var, true).f(du7Var2).t.w();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (js7 js7Var : (List) this.w.getValue()) {
            fy3 fy3Var = (fy3) js7Var.t;
            du7 du7Var3 = (du7) js7Var.u;
            try {
                List<du7> listY = fy3Var.y(du7Var3.g(strW));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listY) {
                    if (a.a((du7) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    du7 du7Var4 = (du7) obj2;
                    du7Var4.getClass();
                    String strReplace = z2a.C(du7Var4.t.w(), du7Var3.t.w()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(du7Var2.g(strReplace));
                }
                rh1.o(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return th1.T(linkedHashSet);
        }
        fk.a(du7Var, "file not found: ");
        return null;
    }
}
