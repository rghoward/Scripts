package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n09 implements m09 {
    public final oh4<Object, Boolean> t;
    public final c37<String, List<Object>> u;
    public c37<String, List<mh4<Object>>> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements m09.a {
        public final /* synthetic */ c37<String, List<mh4<Object>>> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ mh4<Object> c;

        public a(c37<String, List<mh4<Object>>> c37Var, String str, mh4<? extends Object> mh4Var) {
            this.a = c37Var;
            this.b = str;
            this.c = mh4Var;
        }

        @Override // m09.a
        public final void a() {
            c37<String, List<mh4<Object>>> c37Var = this.a;
            String str = this.b;
            List<mh4<Object>> listK = c37Var.k(str);
            if (listK != null) {
                listK.remove(this.c);
            }
            if (listK == null || listK.isEmpty()) {
                return;
            }
            c37Var.m(str, listK);
        }
    }

    public n09(Map<String, ? extends List<? extends Object>> map, oh4<Object, Boolean> oh4Var) {
        c37<String, List<Object>> c37Var;
        this.t = oh4Var;
        if (map == null || map.isEmpty()) {
            c37Var = null;
        } else {
            c37Var = new c37<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                c37Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.u = c37Var;
    }

    @Override // defpackage.m09
    public final boolean a(Object obj) {
        return this.t.invoke(obj).booleanValue();
    }

    @Override // defpackage.m09
    public final m09.a b(mh4 mh4Var, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ta1.c(str.charAt(i))) {
                c37<String, List<mh4<Object>>> c37VarB = this.v;
                if (c37VarB == null) {
                    c37VarB = z39.b();
                    this.v = c37VarB;
                }
                List<mh4<Object>> listD = c37VarB.d(str);
                if (listD == null) {
                    listD = new ArrayList<>();
                    c37VarB.m(str, listD);
                }
                listD.add(mh4Var);
                return new a(c37VarB, str, mh4Var);
            }
        }
        z90.a("Registered key is empty or blank");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.m09
    public final Map<String, List<Object>> c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        c37<String, List<Object>> c37Var = this.u;
        if (c37Var == null && this.v == null) {
            return if3.t;
        }
        int i3 = 0;
        int i4 = c37Var != null ? c37Var.e : 0;
        c37<String, List<mh4<Object>>> c37Var2 = this.v;
        HashMap map = new HashMap(i4 + (c37Var2 != null ? c37Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (c37Var != null) {
            Object[] objArr = c37Var.b;
            Object[] objArr2 = c37Var.c;
            long[] jArr3 = c37Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        c37<String, List<mh4<Object>>> c37Var3 = this.v;
        if (c37Var3 != null) {
            Object[] objArr3 = c37Var3.b;
            Object[] objArr4 = c37Var3.c;
            long[] jArr4 = c37Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((mh4) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            p.a(mm8.b(objInvoke));
                                            return null;
                                        }
                                        map.put(str, ws0.c(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((mh4) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            p.a(mm8.b(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.m09
    public final Object d(String str) {
        c37<String, List<Object>> c37Var = this.u;
        List<Object> listK = c37Var != null ? c37Var.k(str) : null;
        if (listK == null || listK.isEmpty()) {
            return null;
        }
        if (listK.size() > 1 && c37Var != null) {
            List<Object> listSubList = listK.subList(1, listK.size());
            int i = c37Var.i(str);
            if (i < 0) {
                i = ~i;
            }
            Object[] objArr = c37Var.c;
            Object obj = objArr[i];
            c37Var.b[i] = str;
            objArr[i] = listSubList;
        }
        return listK.get(0);
    }
}
