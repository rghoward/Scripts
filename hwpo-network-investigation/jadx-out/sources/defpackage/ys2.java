package defpackage;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys2 {
    public static final xs2 h = new xs2();
    public static final Random i = new Random();
    public sp6 d;
    public String f;
    public final toa.c a = new toa.c();
    public final toa.b b = new toa.b();
    public final HashMap<String, a> c = new HashMap<>();
    public toa e = toa.a;
    public long g = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final String a;
        public int b;
        public long c;
        public final bq6.b d;
        public boolean e;
        public boolean f;

        public a(String str, int i, bq6.b bVar) {
            this.a = str;
            this.b = i;
            this.c = bVar == null ? -1L : bVar.d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.d = bVar;
        }

        public final boolean a(aj.a aVar) {
            bq6.b bVar = aVar.d;
            toa toaVar = aVar.b;
            if (bVar == null) {
                return this.b != aVar.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            bq6.b bVar2 = this.d;
            if (bVar2 == null) {
                return false;
            }
            int i = bVar2.b;
            int iB = toaVar.b(bVar.a);
            int iB2 = toaVar.b(bVar2.a);
            if (bVar.d < bVar2.d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar.b()) {
                int i2 = bVar.e;
                return i2 == -1 || i2 > i;
            }
            int i3 = bVar.b;
            int i4 = bVar.c;
            if (i3 <= i) {
                return i3 == i && i4 > bVar2.c;
            }
            return true;
        }

        public final boolean b(toa toaVar, toa toaVar2) {
            bq6.b bVar;
            int i = this.b;
            if (i < toaVar.o()) {
                ys2 ys2Var = ys2.this;
                toa.c cVar = ys2Var.a;
                toaVar.n(i, cVar);
                int i2 = cVar.n;
                while (true) {
                    if (i2 > cVar.o) {
                        i = -1;
                        break;
                    }
                    int iB = toaVar2.b(toaVar.l(i2));
                    if (iB != -1) {
                        i = toaVar2.f(iB, ys2Var.b, false).c;
                        break;
                    }
                    i2++;
                }
            } else if (i >= toaVar2.o()) {
                i = -1;
                break;
            }
            this.b = i;
            return i != -1 && ((bVar = this.d) == null || toaVar2.b(bVar.a) != -1);
        }
    }

    public final void a(a aVar) {
        long j = aVar.c;
        if (j != -1 && aVar.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final a b(int i2, bq6.b bVar) {
        long j;
        long j2;
        long j3;
        HashMap<String, a> map = this.c;
        a aVar = null;
        long j4 = Long.MAX_VALUE;
        for (a aVar2 : map.values()) {
            long j5 = aVar2.c;
            bq6.b bVar2 = aVar2.d;
            if (j5 == -1 && i2 == aVar2.b && bVar != null) {
                long j6 = bVar.d;
                ys2 ys2Var = ys2.this;
                j = -1;
                a aVar3 = ys2Var.c.get(ys2Var.f);
                if (aVar3 != null) {
                    j3 = aVar3.c;
                    if (j3 == -1) {
                        j3 = ys2Var.g + 1;
                    }
                } else {
                    j3 = ys2Var.g + 1;
                }
                if (j6 >= j3) {
                    aVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (bVar != null) {
                long j7 = bVar.d;
                if (j7 != j) {
                    if (bVar2 == null) {
                        if (!bVar.b() && j7 == aVar2.c) {
                            j2 = aVar2.c;
                            if (j2 != j || j2 < j4) {
                                aVar = aVar2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = n6b.a;
                                if (aVar.d != null && bVar2 != null) {
                                    aVar = aVar2;
                                }
                            }
                        }
                    } else if (j7 == bVar2.d && bVar.b == bVar2.b && bVar.c == bVar2.c) {
                        j2 = aVar2.c;
                        if (j2 != j) {
                        }
                        aVar = aVar2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == aVar2.b) {
                j2 = aVar2.c;
                if (j2 != j) {
                }
                aVar = aVar2;
                j4 = j2;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str2 = (String) h.get();
        a aVar4 = new a(str2, i2, bVar);
        map.put(str2, aVar4);
        return aVar4;
    }

    public final synchronized String c(toa toaVar, bq6.b bVar) {
        return b(toaVar.g(bVar.a, this.b).c, bVar).a;
    }

    public final void d(aj.a aVar) {
        bq6.b bVar;
        toa toaVar = aVar.b;
        int i2 = aVar.c;
        bq6.b bVar2 = aVar.d;
        boolean zP = toaVar.p();
        String str = this.f;
        HashMap<String, a> map = this.c;
        if (zP) {
            if (str != null) {
                a aVar2 = map.get(str);
                aVar2.getClass();
                a(aVar2);
                return;
            }
            return;
        }
        a aVar3 = map.get(str);
        this.f = b(i2, bVar2).a;
        e(aVar);
        if (bVar2 != null) {
            long j = bVar2.d;
            if (bVar2.b()) {
                if (aVar3 != null && aVar3.c == j && (bVar = aVar3.d) != null && bVar.b == bVar2.b && bVar.c == bVar2.c) {
                    return;
                }
                b(i2, new bq6.b(j, bVar2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b6, B:44:0x00ba, B:45:0x00c1, B:47:0x00cb, B:49:0x00cf), top: B:54:0x0001 }] */
    public final synchronized void e(aj.a aVar) {
        long j;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        bq6.b bVar = aVar.d;
        if (bVar != null) {
            long j2 = bVar.d;
            if (j2 != -1) {
                a aVar2 = this.c.get(this.f);
                if (aVar2 != null) {
                    j = aVar2.c;
                    if (j == -1) {
                        j = this.g + 1;
                    }
                } else {
                    j = this.g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            a aVar3 = this.c.get(this.f);
            if (aVar3 != null && aVar3.c == -1 && aVar3.b != aVar.c) {
                return;
            }
        }
        a aVarB = b(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = aVarB.a;
        }
        bq6.b bVar2 = aVar.d;
        if (bVar2 != null && bVar2.b()) {
            bq6.b bVar3 = aVar.d;
            a aVarB2 = b(aVar.c, new bq6.b(bVar3.a, bVar3.d, bVar3.b));
            if (!aVarB2.e) {
                aVarB2.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, n6b.Z(0L) + n6b.Z(this.b.e));
                this.d.getClass();
            }
        }
        if (!aVarB.e) {
            aVarB.e = true;
            this.d.getClass();
        }
        if (aVarB.a.equals(this.f) && !aVarB.f) {
            aVarB.f = true;
            this.d.s(aVar, aVarB.a);
        }
    }
}
