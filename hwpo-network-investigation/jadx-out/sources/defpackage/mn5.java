package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mn5 {
    public final h2a a;
    public final boolean b;
    public int c;

    public mn5(xl5 xl5Var, h2a h2aVar) {
        this.a = h2aVar;
        this.b = xl5Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(mn5 mn5Var, xn2 xn2Var, ak0 ak0Var) throws Throwable {
        ln5 ln5Var;
        LinkedHashMap linkedHashMap;
        xn2 xn2Var2;
        byte bE;
        mn5 mn5Var2;
        h2a h2aVar;
        h2a h2aVar2 = mn5Var.a;
        if (ak0Var instanceof ln5) {
            ln5Var = (ln5) ak0Var;
            int i = ln5Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln5Var.A = i - Integer.MIN_VALUE;
            } else {
                ln5Var = new ln5(mn5Var, ak0Var);
            }
        } else {
            ln5Var = new ln5(mn5Var, ak0Var);
        }
        Object obj = ln5Var.y;
        int i2 = ln5Var.A;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = ln5Var.x;
            String str = ln5Var.w;
            linkedHashMap = ln5Var.v;
            mn5Var2 = ln5Var.u;
            xn2Var2 = ln5Var.t;
            dv8.b(obj);
            linkedHashMap.put(str, (JsonElement) obj);
            bE = mn5Var2.a.e();
            if (bE == 4) {
                i3 = i4;
                mn5Var = mn5Var2;
            } else if (bE != 7) {
                h2a.m(mn5Var2.a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            h2aVar = mn5Var2.a;
            if (bE == 6) {
                h2aVar.f((byte) 7);
            } else if (bE == 4) {
                ha7.f(h2aVar);
                throw null;
            }
            return new JsonObject(linkedHashMap);
        }
        dv8.b(obj);
        byte bF = h2aVar2.f((byte) 6);
        if (h2aVar2.q() == 4) {
            h2a.m(h2aVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        xn2Var2 = xn2Var;
        bE = bF;
        h2a h2aVar3 = mn5Var.a;
        if (!h2aVar3.b()) {
            mn5Var2 = mn5Var;
            h2aVar = mn5Var2.a;
            if (bE == 6) {
                h2aVar.f((byte) 7);
            } else if (bE == 4) {
                ha7.f(h2aVar);
                throw null;
            }
            return new JsonObject(linkedHashMap);
        }
        String strJ = mn5Var.b ? h2aVar3.j() : h2aVar3.i();
        h2aVar3.f((byte) 5);
        g2b g2bVar = g2b.a;
        ln5Var.t = xn2Var2;
        ln5Var.u = mn5Var;
        ln5Var.v = linkedHashMap;
        ln5Var.w = strJ;
        ln5Var.x = i3;
        ln5Var.A = 1;
        xn2Var2.a(g2bVar, ln5Var);
        return v72.t;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final JsonElement b() throws Throwable {
        JsonElement jsonObject;
        Object obj;
        Object objInvoke;
        h2a h2aVar = this.a;
        byte bQ = h2aVar.q();
        if (bQ == 1) {
            return d(true);
        }
        if (bQ == 0) {
            return d(false);
        }
        if (bQ != 6) {
            if (bQ == 8) {
                return c();
            }
            h2a.m(h2aVar, "Cannot read Json element because of unexpected ".concat(bw5.c(bQ)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            kn5 kn5Var = new kn5(this, null);
            g2b g2bVar = g2b.a;
            yn2 yn2Var = new yn2();
            yn2Var.t = kn5Var;
            yn2Var.u = g2bVar;
            yn2Var.v = yn2Var;
            v72 v72Var = wn2.a;
            yn2Var.w = v72Var;
            while (true) {
                obj = yn2Var.w;
                r02<? super JsonElement> r02Var = yn2Var.v;
                if (r02Var == null) {
                    break;
                }
                if (xj5.a(v72Var, obj)) {
                    try {
                        kn5 kn5Var2 = yn2Var.t;
                        Object obj2 = yn2Var.u;
                        if (kn5Var2 == 0) {
                            kn5Var2.getClass();
                            h72 context = r02Var.getContext();
                            Object ak5Var = context == ff3.t ? new ak5(r02Var) : new bk5(r02Var, context);
                            fza.b(3, kn5Var2);
                            objInvoke = kn5Var2.invoke(yn2Var, obj2, ak5Var);
                        } else {
                            fza.b(3, kn5Var2);
                            objInvoke = kn5Var2.invoke(yn2Var, obj2, r02Var);
                        }
                        if (objInvoke != v72.t) {
                            r02Var.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        r02Var.resumeWith(new av8.a(th));
                    }
                } else {
                    yn2Var.w = v72Var;
                    r02Var.resumeWith(obj);
                }
            }
            dv8.b(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bF = h2aVar.f((byte) 6);
            if (h2aVar.q() == 4) {
                h2a.m(h2aVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (h2aVar.b()) {
                String strJ = this.b ? h2aVar.j() : h2aVar.i();
                h2aVar.f((byte) 5);
                linkedHashMap.put(strJ, b());
                bF = h2aVar.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    h2a.m(h2aVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                h2aVar.f((byte) 7);
            } else if (bF == 4) {
                ha7.f(h2aVar);
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.c--;
        return jsonObject;
    }

    public final JsonArray c() {
        h2a h2aVar = this.a;
        byte bE = h2aVar.e();
        if (h2aVar.q() == 4) {
            h2a.m(h2aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (h2aVar.b()) {
            arrayList.add(b());
            bE = h2aVar.e();
            if (bE != 4) {
                boolean z = bE == 9;
                int i = h2aVar.b;
                if (!z) {
                    h2a.m(h2aVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            h2aVar.f((byte) 9);
        } else if (bE == 4) {
            ha7.e(h2aVar, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z) {
        boolean z2 = this.b;
        h2a h2aVar = this.a;
        String strJ = (z2 || !z) ? h2aVar.j() : h2aVar.i();
        return (z || !xj5.a(strJ, "null")) ? new um5(strJ, z) : JsonNull.INSTANCE;
    }
}
