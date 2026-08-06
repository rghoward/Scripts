package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f1d {
    public final boolean a = true;
    public final String b;
    public final p0c c;
    public final vl8 d;
    public final e1d e;

    /* JADX WARN: Code duplicated, block: B:110:0x0276  */
    /* JADX WARN: Code duplicated, block: B:111:0x0279  */
    /* JADX WARN: Code duplicated, block: B:114:0x027f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0298  */
    /* JADX WARN: Code duplicated, block: B:118:0x029d  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:161:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public f1d(evc evcVar, e1d e1dVar) throws Throwable {
        vl8 vl8VarA;
        Throwable th;
        char c;
        long j;
        long j2;
        String str;
        int i = 1;
        kuc kucVar = evcVar.a;
        ztc ztcVar = evcVar.b;
        if (kucVar.a.isEmpty()) {
            ztc.E().equals(ztcVar);
        }
        this.b = ztcVar.x();
        this.c = ztcVar.y();
        ztcVar.getClass();
        ztcVar.getClass();
        Throwable th2 = null;
        Map mapC = ztcVar.B() == 0 ? null : ztcVar.C();
        if (mapC != null) {
            q95.p(mapC.keySet());
        } else {
            Object[] objArr = wl8.B;
        }
        int iB = ztcVar.B();
        kuc kucVar2 = evcVar.a;
        char c2 = 3;
        if (iB > 0) {
            Collection<ktc> collectionValues = ztcVar.C().values();
            if (collectionValues == null) {
                vl8VarA = vl8.z;
            } else {
                m95.a aVarA = m95.a();
                for (ktc ktcVar : collectionValues) {
                    int iL = ktcVar.L();
                    int i2 = iL - 1;
                    if (iL == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        aVarA.b(ktcVar.x(), Long.valueOf(ktcVar.y()));
                    } else if (i2 == 1) {
                        aVarA.b(ktcVar.x(), Boolean.valueOf(ktcVar.z()));
                    } else if (i2 == 2) {
                        aVarA.b(ktcVar.x(), Double.valueOf(ktcVar.A()));
                    } else if (i2 == 3) {
                        aVarA.b(ktcVar.x(), ktcVar.B());
                    } else {
                        if (i2 != 4) {
                            aa0.c("Could not serialize Flag for override: ".concat(String.valueOf(ktcVar.x())));
                            throw null;
                        }
                        aVarA.b(ktcVar.x(), ktcVar.C().p());
                    }
                }
                vl8VarA = aVarA.a(false);
            }
            if (!vl8VarA.isEmpty()) {
                HashMap map = new HashMap(vl8VarA);
                r95 r95Var = kucVar2.a;
                r95.a aVar = new r95.a(n47.t);
                w2b it = r95Var.iterator();
                while (true) {
                    h1 h1Var = (h1) it;
                    if (!h1Var.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    th = th2;
                                    c = c2;
                                } else {
                                    th = th2;
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i3 = i;
                                            while (true) {
                                                if (i3 >= length) {
                                                    j = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i3) - '0';
                                                j = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (j2 == j) {
                                            str = str2;
                                        } else {
                                            str = th;
                                        }
                                        if (obj instanceof String) {
                                            aVar.c(new iuc(j2, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            aVar.c(new iuc(j2, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            aVar.c(new iuc(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            aVar.c(new iuc(j2, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                aa0.c(ao2.a(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                                throw th;
                                            }
                                            aVar.c(new iuc(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        th2 = th;
                                        i = 1;
                                    }
                                    j2 = j;
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = th;
                                    }
                                    if (obj instanceof String) {
                                        aVar.c(new iuc(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        aVar.c(new iuc(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        aVar.c(new iuc(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        aVar.c(new iuc(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            aa0.c(ao2.a(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                            throw th;
                                        }
                                        aVar.c(new iuc(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    th2 = th;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = th;
                                }
                                if (obj instanceof String) {
                                    aVar.c(new iuc(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    aVar.c(new iuc(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    aVar.c(new iuc(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    aVar.c(new iuc(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        aa0.c(ao2.a(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                        throw th;
                                    }
                                    aVar.c(new iuc(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                th2 = th;
                                i = 1;
                            } else {
                                th = th2;
                                c = c2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = th;
                            }
                            if (obj instanceof String) {
                                aVar.c(new iuc(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                aVar.c(new iuc(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                aVar.c(new iuc(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                aVar.c(new iuc(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    aa0.c(ao2.a(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                                    throw th;
                                }
                                aVar.c(new iuc(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            th2 = th;
                            i = 1;
                        }
                        kucVar2 = new kuc(aVar.h());
                        break;
                    }
                    iuc iucVar = (iuc) h1Var.next();
                    Object obj2 = iucVar.u;
                    long j3 = iucVar.t;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j3) : obj2);
                    if (objRemove == null) {
                        aVar.c(iucVar);
                    } else if (objRemove instanceof String) {
                        aVar.c(new iuc(iucVar.t, iucVar.u, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        aVar.c(new iuc(iucVar.t, iucVar.u, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        aVar.c(new iuc(iucVar.t, iucVar.u, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        aVar.c(new iuc(iucVar.t, iucVar.u, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = iucVar.u;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(ao2.a(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        aVar.c(new iuc(iucVar.t, iucVar.u, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((xl8) kucVar2.a).z.size() + 3;
        zg1.b(size, "expectedSize");
        m95.a aVar2 = new m95.a(size);
        w2b it2 = kucVar2.a.iterator();
        while (true) {
            h1 h1Var2 = (h1) it2;
            if (!h1Var2.hasNext()) {
                aVar2.b("__phenotype_server_token", ztcVar.z());
                aVar2.b("__phenotype_snapshot_token", ztcVar.x());
                aVar2.b("__phenotype_configuration_version", Long.valueOf(ztcVar.A()));
                this.d = aVar2.a(false);
                this.e = e1dVar;
                return;
            }
            iuc iucVar2 = (iuc) h1Var2.next();
            String string3 = iucVar2.u;
            if (string3 == null) {
                string3 = Long.toString(iucVar2.t);
            }
            aVar2.b(string3, iucVar2.a());
        }
    }

    public f1d(i1d i1dVar, e1d e1dVar) {
        i1d.E().equals(i1dVar);
        this.b = i1dVar.x();
        this.c = i1dVar.y();
        int i = q95.v;
        Object[] objArr = wl8.B;
        int iC = i1dVar.C() + 3;
        zg1.b(iC, "expectedSize");
        m95.a aVar = new m95.a(iC);
        for (k1d k1dVar : i1dVar.B()) {
            int iK = k1dVar.K();
            int i2 = iK - 1;
            if (iK == 0) {
                throw null;
            }
            if (i2 == 0) {
                aVar.b(k1dVar.x(), Long.valueOf(k1dVar.y()));
            } else if (i2 == 1) {
                aVar.b(k1dVar.x(), Boolean.valueOf(k1dVar.z()));
            } else if (i2 == 2) {
                aVar.b(k1dVar.x(), Double.valueOf(k1dVar.A()));
            } else if (i2 == 3) {
                aVar.b(k1dVar.x(), k1dVar.B());
            } else if (i2 == 4) {
                aVar.b(k1dVar.x(), k1dVar.C().p());
            }
        }
        aVar.b("__phenotype_server_token", i1dVar.z());
        aVar.b("__phenotype_snapshot_token", i1dVar.x());
        aVar.b("__phenotype_configuration_version", Long.valueOf(i1dVar.A()));
        this.d = aVar.a(false);
        this.e = e1dVar;
    }
}
