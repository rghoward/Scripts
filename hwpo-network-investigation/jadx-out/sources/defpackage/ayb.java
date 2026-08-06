package defpackage;

import android.util.Log;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ayb extends azb {
    public final efc g;
    public final /* synthetic */ z0c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayb(z0c z0cVar, String str, int i, efc efcVar) {
        super(str, i);
        this.h = z0cVar;
        this.g = efcVar;
    }

    @Override // defpackage.azb
    public final int a() {
        return this.g.y();
    }

    @Override // defpackage.azb
    public final boolean b() {
        return false;
    }

    @Override // defpackage.azb
    public final boolean c() {
        return this.g.D();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0272  */
    /* JADX WARN: Code duplicated, block: B:105:0x0292  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:131:0x0303  */
    /* JADX WARN: Code duplicated, block: B:133:0x0309  */
    /* JADX WARN: Code duplicated, block: B:135:0x031d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0323  */
    /* JADX WARN: Code duplicated, block: B:139:0x032b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0335  */
    /* JADX WARN: Code duplicated, block: B:150:0x0358  */
    /* JADX WARN: Code duplicated, block: B:153:0x0361  */
    /* JADX WARN: Code duplicated, block: B:158:0x0398 A[EDGE_INSN: B:158:0x0398->B:161:0x03c2 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ab A[EDGE_INSN: B:159:0x03ab->B:161:0x03c2 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6]] */
    /* JADX WARN: Code duplicated, block: B:205:0x033c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c2 A[EDGE_INSN: B:234:0x03c2->B:161:0x03c2 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6 A[LOOP:1: B:59:0x0183->B:64:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x0200  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Code duplicated, block: B:96:0x0259  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean g(Long l, Long l2, tjc tjcVar, long j, r9c r9cVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        n30 n30Var;
        Iterator it2;
        Iterator it3;
        gfc gfcVar;
        boolean z2;
        String strE;
        V v;
        Boolean boolF;
        Boolean boolF2;
        String str;
        jfc jfcVarA;
        long j2;
        Boolean boolF3;
        akc akcVar;
        Long lValueOf;
        Double dValueOf;
        gfc gfcVar2;
        Boolean boolF4;
        int i;
        t5c.a();
        z0c z0cVar = this.h;
        tkc tkcVar = z0cVar.a;
        t7c t7cVar = tkcVar.d;
        thc thcVar = tkcVar.f;
        fhc fhcVar = tkcVar.j;
        ufc ufcVar = wfc.F0;
        String str2 = this.a;
        boolean zR = t7cVar.r(str2, ufcVar);
        efc efcVar = this.g;
        long j3 = efcVar.I() ? r9cVar.e : j;
        tkc.m(thcVar);
        phc phcVar = thcVar.n;
        phc phcVar2 = thcVar.i;
        boolean zIsLoggable = Log.isLoggable(thcVar.q(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            tkc.m(thcVar);
            phcVar.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), efcVar.x() ? Integer.valueOf(efcVar.y()) : null, fhcVar.a(efcVar.z()));
            tkc.m(thcVar);
            qzc qzcVar = z0cVar.b.g;
            lzc.U(qzcVar);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (efcVar.x()) {
                i = 0;
                qzc.B(sb, 0, "filter_id", Integer.valueOf(efcVar.y()));
            } else {
                i = 0;
            }
            qzc.B(sb, i, "event_name", qzcVar.a.j.a(efcVar.z()));
            String strX = qzc.x(efcVar.F(), efcVar.G(), efcVar.I());
            if (!strX.isEmpty()) {
                qzc.B(sb, 0, "filter_type", strX);
            }
            if (efcVar.D()) {
                qzc.C(sb, 1, "event_count_filter", efcVar.E());
            }
            if (efcVar.B() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = efcVar.A().iterator();
                while (it4.hasNext()) {
                    qzcVar.u(sb, 2, (gfc) it4.next());
                }
            }
            qzc.v(1, sb);
            sb.append("}\n}\n");
            phcVar.b(sb.toString(), "Filter definition");
        }
        if (!efcVar.x() || efcVar.y() > 256) {
            tkc.m(thcVar);
            phcVar2.c(thc.o(str2), String.valueOf(efcVar.x() ? Integer.valueOf(efcVar.y()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = efcVar.F() || efcVar.G() || efcVar.I();
        if (z && !z3) {
            tkc.m(thcVar);
            phcVar.c(Integer.valueOf(i2), efcVar.x() ? Integer.valueOf(efcVar.y()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strC = tjcVar.C();
        if (!efcVar.D()) {
            hashSet = new HashSet();
            it = efcVar.A().iterator();
            while (true) {
                if (it.hasNext()) {
                    n30Var = new n30();
                    it2 = tjcVar.z().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = efcVar.A().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zR = zR;
                                    thcVar = thcVar;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                gfcVar = (gfc) it3.next();
                                if (gfcVar.B()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strE = gfcVar.E();
                                if (strE.isEmpty()) {
                                    v = n30Var.get(strE);
                                    if (v instanceof Long) {
                                        if (v instanceof Double) {
                                            if (v instanceof String) {
                                                zR = zR;
                                                thcVar = thcVar;
                                                if (v == 0) {
                                                    tkc.m(thcVar);
                                                    phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "Unknown param type. event, param");
                                                    break;
                                                }
                                                tkc.m(thcVar);
                                                phcVar.c(fhcVar.a(strC), fhcVar.b(strE), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (gfcVar.x()) {
                                                if (gfcVar.z()) {
                                                    zR = zR;
                                                    thcVar = thcVar;
                                                    tkc.m(thcVar);
                                                    phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) v;
                                                if (qzc.K(str)) {
                                                    zR = zR;
                                                    thcVar = thcVar;
                                                    tkc.m(thcVar);
                                                    phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                jfcVarA = gfcVar.A();
                                                if (qzc.K(str)) {
                                                    zR = zR;
                                                    thcVar = thcVar;
                                                    j2 = 0;
                                                    boolF3 = azb.f(new BigDecimal(str), jfcVarA, 0.0d);
                                                } else {
                                                    boolF3 = null;
                                                }
                                                if (boolF3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolF3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                thcVar = thcVar;
                                                zR = zR;
                                            } else {
                                                ofc ofcVarY = gfcVar.y();
                                                tkc.m(thcVar);
                                                boolF3 = azb.e((String) v, ofcVarY, thcVar);
                                            }
                                            j2 = 0;
                                            if (boolF3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolF3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            thcVar = thcVar;
                                            zR = zR;
                                        } else if (gfcVar.z()) {
                                            double dDoubleValue = ((Double) v).doubleValue();
                                            boolF2 = azb.f(new BigDecimal(dDoubleValue), gfcVar.A(), Math.ulp(dDoubleValue));
                                            if (boolF2 != null) {
                                                if (boolF2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            tkc.m(thcVar);
                                            phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "No number filter for double param. event, param");
                                        }
                                    } else if (gfcVar.z()) {
                                        boolF = azb.f(new BigDecimal(((Long) v).longValue()), gfcVar.A(), 0.0d);
                                        if (boolF != null) {
                                            if (boolF.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        tkc.m(thcVar);
                                        phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "No number filter for long param. event, param");
                                    }
                                } else {
                                    tkc.m(thcVar);
                                    phcVar2.b(fhcVar.a(strC), "Event has empty param name. event");
                                }
                            }
                        } else {
                            akcVar = (akc) it2.next();
                            if (!hashSet.contains(akcVar.y())) {
                                if (akcVar.B()) {
                                    String strY = akcVar.y();
                                    if (akcVar.B()) {
                                        lValueOf = Long.valueOf(akcVar.C());
                                    } else {
                                        lValueOf = null;
                                    }
                                    n30Var.put(strY, lValueOf);
                                } else if (akcVar.F()) {
                                    String strY2 = akcVar.y();
                                    if (akcVar.F()) {
                                        dValueOf = Double.valueOf(akcVar.G());
                                    } else {
                                        dValueOf = null;
                                    }
                                    n30Var.put(strY2, dValueOf);
                                } else if (akcVar.z()) {
                                    n30Var.put(akcVar.y(), akcVar.A());
                                } else {
                                    tkc.m(thcVar);
                                    phcVar2.c(fhcVar.a(strC), fhcVar.b(akcVar.y()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    gfcVar2 = (gfc) it.next();
                    if (gfcVar2.E().isEmpty()) {
                        tkc.m(thcVar);
                        phcVar2.b(fhcVar.a(strC), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(gfcVar2.E());
                    }
                }
                zR = zR;
                thcVar = thcVar;
                break;
            }
        }
        try {
            boolF4 = azb.f(new BigDecimal(j3), efcVar.E(), 0.0d);
        } catch (NumberFormatException unused) {
            boolF4 = null;
        }
        if (boolF4 != null) {
            if (boolF4.booleanValue()) {
                hashSet = new HashSet();
                it = efcVar.A().iterator();
                while (true) {
                    if (it.hasNext()) {
                        n30Var = new n30();
                        it2 = tjcVar.z().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = efcVar.A().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zR = zR;
                                        thcVar = thcVar;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    gfcVar = (gfc) it3.next();
                                    if (gfcVar.B() || !gfcVar.C()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strE = gfcVar.E();
                                    if (strE.isEmpty()) {
                                        v = n30Var.get(strE);
                                        if (v instanceof Long) {
                                            if (v instanceof Double) {
                                                if (v instanceof String) {
                                                    zR = zR;
                                                    thcVar = thcVar;
                                                    if (v == 0) {
                                                        tkc.m(thcVar);
                                                        phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    tkc.m(thcVar);
                                                    phcVar.c(fhcVar.a(strC), fhcVar.b(strE), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (gfcVar.x()) {
                                                    if (gfcVar.z()) {
                                                        zR = zR;
                                                        thcVar = thcVar;
                                                        tkc.m(thcVar);
                                                        phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) v;
                                                    if (qzc.K(str)) {
                                                        zR = zR;
                                                        thcVar = thcVar;
                                                        tkc.m(thcVar);
                                                        phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    jfcVarA = gfcVar.A();
                                                    if (qzc.K(str)) {
                                                        boolF3 = null;
                                                    } else {
                                                        try {
                                                            zR = zR;
                                                            thcVar = thcVar;
                                                            j2 = 0;
                                                            try {
                                                                boolF3 = azb.f(new BigDecimal(str), jfcVarA, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolF3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zR = zR;
                                                            thcVar = thcVar;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolF3 != null) {
                                                        break;
                                                    }
                                                    if (boolF3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    thcVar = thcVar;
                                                    zR = zR;
                                                } else {
                                                    ofc ofcVarY2 = gfcVar.y();
                                                    tkc.m(thcVar);
                                                    boolF3 = azb.e((String) v, ofcVarY2, thcVar);
                                                }
                                                j2 = 0;
                                                if (boolF3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolF3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                thcVar = thcVar;
                                                zR = zR;
                                            } else if (gfcVar.z()) {
                                                tkc.m(thcVar);
                                                phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) v).doubleValue();
                                                try {
                                                    boolF2 = azb.f(new BigDecimal(dDoubleValue2), gfcVar.A(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolF2 = null;
                                                }
                                                if (boolF2 != null) {
                                                    if (boolF2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (gfcVar.z()) {
                                            tkc.m(thcVar);
                                            phcVar2.c(fhcVar.a(strC), fhcVar.b(strE), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolF = azb.f(new BigDecimal(((Long) v).longValue()), gfcVar.A(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolF = null;
                                            }
                                            if (boolF != null) {
                                                if (boolF.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        tkc.m(thcVar);
                                        phcVar2.b(fhcVar.a(strC), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                akcVar = (akc) it2.next();
                                if (!hashSet.contains(akcVar.y())) {
                                    if (akcVar.B()) {
                                        String strY3 = akcVar.y();
                                        if (akcVar.B()) {
                                            lValueOf = Long.valueOf(akcVar.C());
                                        } else {
                                            lValueOf = null;
                                        }
                                        n30Var.put(strY3, lValueOf);
                                    } else if (akcVar.F()) {
                                        String strY4 = akcVar.y();
                                        if (akcVar.F()) {
                                            dValueOf = Double.valueOf(akcVar.G());
                                        } else {
                                            dValueOf = null;
                                        }
                                        n30Var.put(strY4, dValueOf);
                                    } else if (akcVar.z()) {
                                        n30Var.put(akcVar.y(), akcVar.A());
                                    } else {
                                        tkc.m(thcVar);
                                        phcVar2.c(fhcVar.a(strC), fhcVar.b(akcVar.y()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        gfcVar2 = (gfc) it.next();
                        if (gfcVar2.E().isEmpty()) {
                            tkc.m(thcVar);
                            phcVar2.b(fhcVar.a(strC), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(gfcVar2.E());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zR = zR;
        thcVar = thcVar;
        break;
        tkc.m(thcVar);
        phcVar.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !tjcVar.D()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(tjcVar.E());
        if (efcVar.G()) {
            if (zR && efcVar.D()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zR && efcVar.D()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }
}
