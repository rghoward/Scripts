package androidx.recyclerview.widget;

import defpackage.i34;
import defpackage.x58;
import defpackage.z90;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final c0 d;
    public final x58 a = new x58(30);
    public final ArrayList<C0026a> b = new ArrayList<>();
    public final ArrayList<C0026a> c = new ArrayList<>();
    public int f = 0;
    public final u e = new u(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C0026a {
        public int a;
        public int b;
        public int c;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0026a)) {
                    return false;
                }
                C0026a c0026a = (C0026a) obj;
                int i = this.a;
                if (i != c0026a.a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.c - this.b) != 1 || this.c != c0026a.b || this.b != c0026a.c) {
                    return this.c == c0026a.c && this.b == c0026a.b;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            return i34.b(this.c, ",p:null]", sb);
        }
    }

    public a(c0 c0Var) {
        this.d = c0Var;
    }

    public final boolean a(int i) {
        ArrayList<C0026a> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0026a c0026a = arrayList.get(i2);
            int i3 = c0026a.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0026a.b;
                    int i5 = c0026a.c + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0026a.c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0026a> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a(arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0026a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0026a c0026a = arrayList.get(i);
            int i2 = c0026a.a;
            c0 c0Var = this.d;
            if (i2 == 1) {
                c0Var.a(c0026a);
                c0Var.d(c0026a.b, c0026a.c);
            } else if (i2 == 2) {
                c0Var.a(c0026a);
                int i3 = c0026a.b;
                int i4 = c0026a.c;
                RecyclerView recyclerView = c0Var.a;
                recyclerView.U(i3, true, i4);
                recyclerView.E0 = true;
                recyclerView.B0.c += i4;
            } else if (i2 == 4) {
                c0Var.a(c0026a);
                c0Var.c(c0026a.b, c0026a.c);
            } else if (i2 == 8) {
                c0Var.a(c0026a);
                c0Var.e(c0026a.b, c0026a.c);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(C0026a c0026a) {
        int i;
        x58 x58Var;
        int i2 = c0026a.a;
        if (i2 == 1 || i2 == 8) {
            z90.a("should not dispatch add or move for pre layout");
            return;
        }
        int iL = l(c0026a.b, i2);
        int i3 = c0026a.b;
        int i4 = c0026a.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                defpackage.u.c(c0026a, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0026a.c;
            x58Var = this.a;
            if (i5 >= i7) {
                break;
            }
            int iL2 = l((i * i5) + c0026a.b, c0026a.a);
            int i8 = c0026a.a;
            if (i8 == 2 ? iL2 != iL : !(i8 == 4 && iL2 == iL + 1)) {
                C0026a c0026aH = h(i8, iL, i6);
                e(c0026aH, i3);
                x58Var.a(c0026aH);
                if (c0026a.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iL = iL2;
            } else {
                i6++;
            }
            i5++;
        }
        x58Var.a(c0026a);
        if (i6 > 0) {
            C0026a c0026aH2 = h(c0026a.a, iL, i6);
            e(c0026aH2, i3);
            x58Var.a(c0026aH2);
        }
    }

    public final void e(C0026a c0026a, int i) {
        c0 c0Var = this.d;
        c0Var.a(c0026a);
        int i2 = c0026a.a;
        if (i2 != 2) {
            if (i2 == 4) {
                c0Var.c(i, c0026a.c);
                return;
            } else {
                z90.a("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = c0026a.c;
        RecyclerView recyclerView = c0Var.a;
        recyclerView.U(i, true, i3);
        recyclerView.E0 = true;
        recyclerView.B0.c += i3;
    }

    public final int f(int i, int i2) {
        ArrayList<C0026a> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            C0026a c0026a = arrayList.get(i2);
            int i3 = c0026a.a;
            int i4 = c0026a.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c0026a.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0026a.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c0026a.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c0026a.c;
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final C0026a h(int i, int i2, int i3) {
        C0026a c0026a = (C0026a) this.a.b();
        if (c0026a != null) {
            c0026a.a = i;
            c0026a.b = i2;
            c0026a.c = i3;
            return c0026a;
        }
        C0026a c0026a2 = new C0026a();
        c0026a2.a = i;
        c0026a2.b = i2;
        c0026a2.c = i3;
        return c0026a2;
    }

    public final void i(C0026a c0026a) {
        this.c.add(c0026a);
        int i = c0026a.a;
        c0 c0Var = this.d;
        if (i == 1) {
            c0Var.d(c0026a.b, c0026a.c);
            return;
        }
        if (i == 2) {
            int i2 = c0026a.b;
            int i3 = c0026a.c;
            RecyclerView recyclerView = c0Var.a;
            recyclerView.U(i2, false, i3);
            recyclerView.E0 = true;
            return;
        }
        if (i == 4) {
            c0Var.c(c0026a.b, c0026a.c);
        } else if (i == 8) {
            c0Var.e(c0026a.b, c0026a.c);
        } else {
            defpackage.u.c(c0026a, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    public final void j() {
        ArrayList<C0026a> arrayList;
        int i;
        boolean z;
        byte b;
        C0026a c0026aH;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        u uVar = this.e;
        uVar.getClass();
        while (true) {
            arrayList = this.b;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i5 = size + 1;
            a aVar = uVar.a;
            x58 x58Var = aVar.a;
            C0026a c0026a = arrayList.get(size);
            C0026a c0026a2 = arrayList.get(i5);
            int i6 = c0026a2.a;
            if (i6 != 1) {
                C0026a c0026aH2 = null;
                if (i6 == 2) {
                    int i7 = c0026a.b;
                    int i8 = c0026a.c;
                    int i9 = c0026a2.b;
                    if (i7 < i8) {
                        z3 = i9 == i7 && c0026a2.c == i8 - i7;
                        z2 = false;
                    } else if (i9 == i8 + 1 && c0026a2.c == i7 - i8) {
                        z3 = true;
                        z2 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    if (i8 < i9) {
                        c0026a2.b = i9 - 1;
                    } else {
                        int i10 = c0026a2.c;
                        if (i8 < i9 + i10) {
                            c0026a2.c = i10 - 1;
                            c0026a.a = 2;
                            c0026a.c = 1;
                            if (c0026a2.c == 0) {
                                arrayList.remove(i5);
                                x58Var.a(c0026a2);
                            }
                        }
                    }
                    int i11 = c0026a.b;
                    int i12 = c0026a2.b;
                    if (i11 <= i12) {
                        c0026a2.b = i12 + 1;
                    } else {
                        int i13 = i12 + c0026a2.c;
                        if (i11 < i13) {
                            c0026aH2 = aVar.h(2, i11 + 1, i13 - i11);
                            c0026a2.c = c0026a.b - c0026a2.b;
                        }
                    }
                    if (z3) {
                        arrayList.set(size, c0026a2);
                        arrayList.remove(i5);
                        x58Var.a(c0026a);
                    } else {
                        if (z2) {
                            if (c0026aH2 != null) {
                                int i14 = c0026a.b;
                                if (i14 > c0026aH2.b) {
                                    c0026a.b = i14 - c0026aH2.c;
                                }
                                int i15 = c0026a.c;
                                if (i15 > c0026aH2.b) {
                                    c0026a.c = i15 - c0026aH2.c;
                                }
                            }
                            int i16 = c0026a.b;
                            if (i16 > c0026a2.b) {
                                c0026a.b = i16 - c0026a2.c;
                            }
                            int i17 = c0026a.c;
                            if (i17 > c0026a2.b) {
                                c0026a.c = i17 - c0026a2.c;
                            }
                        } else {
                            if (c0026aH2 != null) {
                                int i18 = c0026a.b;
                                if (i18 >= c0026aH2.b) {
                                    c0026a.b = i18 - c0026aH2.c;
                                }
                                int i19 = c0026a.c;
                                if (i19 >= c0026aH2.b) {
                                    c0026a.c = i19 - c0026aH2.c;
                                }
                            }
                            int i20 = c0026a.b;
                            if (i20 >= c0026a2.b) {
                                c0026a.b = i20 - c0026a2.c;
                            }
                            int i21 = c0026a.c;
                            if (i21 >= c0026a2.b) {
                                c0026a.c = i21 - c0026a2.c;
                            }
                        }
                        arrayList.set(size, c0026a2);
                        if (c0026a.b != c0026a.c) {
                            arrayList.set(i5, c0026a);
                        } else {
                            arrayList.remove(i5);
                        }
                        if (c0026aH2 != null) {
                            arrayList.add(size, c0026aH2);
                        }
                    }
                } else if (i6 == 4) {
                    int i22 = c0026a.c;
                    int i23 = c0026a2.b;
                    if (i22 < i23) {
                        c0026a2.b = i23 - 1;
                    } else {
                        int i24 = c0026a2.c;
                        if (i22 < i23 + i24) {
                            c0026a2.c = i24 - 1;
                            c0026aH = aVar.h(4, c0026a.b, 1);
                        }
                        i2 = c0026a.b;
                        i3 = c0026a2.b;
                        if (i2 <= i3) {
                            c0026a2.b = i3 + 1;
                        } else {
                            i4 = i3 + c0026a2.c;
                            if (i2 < i4) {
                                int i25 = i4 - i2;
                                c0026aH2 = aVar.h(4, i2 + 1, i25);
                                c0026a2.c -= i25;
                            }
                        }
                        arrayList.set(i5, c0026a);
                        if (c0026a2.c > 0) {
                            arrayList.set(size, c0026a2);
                        } else {
                            arrayList.remove(size);
                            x58Var.a(c0026a2);
                        }
                        if (c0026aH != null) {
                            arrayList.add(size, c0026aH);
                        }
                        if (c0026aH2 != null) {
                            arrayList.add(size, c0026aH2);
                        }
                    }
                    c0026aH = null;
                    i2 = c0026a.b;
                    i3 = c0026a2.b;
                    if (i2 <= i3) {
                        c0026a2.b = i3 + 1;
                    } else {
                        i4 = i3 + c0026a2.c;
                        if (i2 < i4) {
                            int i26 = i4 - i2;
                            c0026aH2 = aVar.h(4, i2 + 1, i26);
                            c0026a2.c -= i26;
                        }
                    }
                    arrayList.set(i5, c0026a);
                    if (c0026a2.c > 0) {
                        arrayList.set(size, c0026a2);
                    } else {
                        arrayList.remove(size);
                        x58Var.a(c0026a2);
                    }
                    if (c0026aH != null) {
                        arrayList.add(size, c0026aH);
                    }
                    if (c0026aH2 != null) {
                        arrayList.add(size, c0026aH2);
                    }
                }
            } else {
                int i27 = c0026a.c;
                int i28 = c0026a2.b;
                int i29 = i27 < i28 ? -1 : 0;
                int i30 = c0026a.b;
                if (i30 < i28) {
                    i29++;
                }
                if (i28 <= i30) {
                    c0026a.b = i30 + c0026a2.c;
                }
                int i31 = c0026a2.b;
                if (i31 <= i27) {
                    c0026a.c = i27 + c0026a2.c;
                }
                c0026a2.b = i31 + i29;
                arrayList.set(size, c0026a2);
                arrayList.set(i5, c0026a);
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            C0026a c0026aH3 = arrayList.get(i32);
            int i33 = c0026aH3.a;
            if (i33 != 1) {
                x58 x58Var2 = this.a;
                c0 c0Var = this.d;
                if (i33 == 2) {
                    int i34 = c0026aH3.b;
                    int i35 = c0026aH3.c + i34;
                    int i36 = i34;
                    byte b2 = -1;
                    int i37 = 0;
                    while (i36 < i35) {
                        if (c0Var.b(i36) != null || a(i36)) {
                            if (b2 == 0) {
                                d(h(2, i34, i37));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                i(h(2, i34, i37));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 0;
                        }
                        if (z) {
                            i36 -= i37;
                            i35 -= i37;
                            i37 = 1;
                        } else {
                            i37++;
                        }
                        i36++;
                        b2 = b;
                    }
                    if (i37 != c0026aH3.c) {
                        x58Var2.a(c0026aH3);
                        c0026aH3 = h(2, i34, i37);
                    }
                    if (b2 == 0) {
                        d(c0026aH3);
                    } else {
                        i(c0026aH3);
                    }
                } else if (i33 == 4) {
                    int i38 = c0026aH3.b;
                    int i39 = c0026aH3.c + i38;
                    byte b3 = -1;
                    int i40 = i38;
                    int i41 = 0;
                    while (i38 < i39) {
                        if (c0Var.b(i38) != null || a(i38)) {
                            if (b3 == 0) {
                                d(h(4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                i(h(4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b3 = 0;
                        }
                        i41++;
                        i38++;
                    }
                    if (i41 != c0026aH3.c) {
                        x58Var2.a(c0026aH3);
                        c0026aH3 = h(4, i40, i41);
                    }
                    if (b3 == 0) {
                        d(c0026aH3);
                    } else {
                        i(c0026aH3);
                    }
                } else if (i33 == i) {
                    i(c0026aH3);
                }
            } else {
                i(c0026aH3);
            }
            i32++;
            i = 8;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0026a c0026a = (C0026a) arrayList.get(i);
            c0026a.getClass();
            this.a.a(c0026a);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0026a> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0026a c0026a = arrayList.get(size);
            int i5 = c0026a.a;
            int i6 = c0026a.b;
            if (i5 == 8) {
                int i7 = c0026a.c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0026a.b = i6 + 1;
                            c0026a.c = i7 + 1;
                        } else if (i2 == 2) {
                            c0026a.b = i6 - 1;
                            c0026a.c = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c0026a.c = i7 + 1;
                    } else if (i2 == 2) {
                        c0026a.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0026a.b = i6 + 1;
                    } else if (i2 == 2) {
                        c0026a.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c0026a.c;
                } else if (i5 == 2) {
                    i += c0026a.c;
                }
            } else if (i2 == 1) {
                c0026a.b = i6 + 1;
            } else if (i2 == 2) {
                c0026a.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0026a c0026a2 = arrayList.get(size2);
            int i8 = c0026a2.a;
            int i9 = c0026a2.c;
            x58 x58Var = this.a;
            if (i8 == 8) {
                if (i9 == c0026a2.b || i9 < 0) {
                    arrayList.remove(size2);
                    x58Var.a(c0026a2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                x58Var.a(c0026a2);
            }
        }
        return i;
    }
}
