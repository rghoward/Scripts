package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ujc extends fyc implements s7c {
    public final n30 d;
    public final n30 e;
    public final n30 f;
    public final n30 g;
    public final n30 h;
    public final n30 i;
    public final n30 j;
    public final hjc k;
    public final jjc l;
    public final n30 m;
    public final n30 n;
    public final n30 o;

    public ujc(lzc lzcVar) {
        super(lzcVar);
        this.d = new n30();
        this.e = new n30();
        this.f = new n30();
        this.g = new n30();
        this.h = new n30();
        this.i = new n30();
        this.m = new n30();
        this.n = new n30();
        this.o = new n30();
        this.j = new n30();
        this.k = new hjc(this);
        this.l = new jjc(this);
    }

    public static final n30 q(dhc dhcVar) {
        n30 n30Var = new n30();
        for (shc shcVar : dhcVar.B()) {
            n30Var.put(shcVar.x(), shcVar.y());
        }
        return n30Var;
    }

    public static final lnc r(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return lnc.AD_STORAGE;
        }
        if (i2 == 2) {
            return lnc.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return lnc.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return lnc.AD_PERSONALIZATION;
    }

    public final boolean A(String str) {
        g();
        m(str);
        n30 n30Var = this.e;
        return n30Var.get(str) != 0 && ((Set) n30Var.get(str)).contains("app_instance_id");
    }

    public final boolean B(String str, lnc lncVar) {
        g();
        m(str);
        rgc rgcVarC = C(str);
        if (rgcVarC == null) {
            return false;
        }
        for (rfc rfcVar : rgcVarC.x()) {
            if (lncVar == r(rfcVar.x())) {
                return rfcVar.y() == 2;
            }
        }
        return false;
    }

    public final rgc C(String str) {
        g();
        m(str);
        dhc dhcVarS = s(str);
        if (dhcVarS == null || !dhcVarS.J()) {
            return null;
        }
        return dhcVarS.K();
    }

    @Override // defpackage.s7c
    public final String d(String str, String str2) {
        g();
        m(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final hnc k(String str, lnc lncVar) {
        g();
        m(str);
        rgc rgcVarC = C(str);
        if (rgcVarC != null) {
            for (rfc rfcVar : rgcVarC.C()) {
                if (r(rfcVar.x()) == lncVar) {
                    int iY = rfcVar.y() - 1;
                    if (iY == 1) {
                        return hnc.GRANTED;
                    }
                    if (iY != 2) {
                        break;
                    }
                    return hnc.DENIED;
                }
            }
        }
        return hnc.UNINITIALIZED;
    }

    public final boolean l(String str) {
        g();
        m(str);
        rgc rgcVarC = C(str);
        if (rgcVarC == null) {
            return false;
        }
        for (rfc rfcVar : rgcVarC.x()) {
            if (rfcVar.x() == 3 && rfcVar.z() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void m(String str) {
        h();
        g();
        a78.d(str);
        n30 n30Var = this.i;
        if (n30Var.get(str) == 0) {
            p8c p8cVar = this.b.c;
            lzc.U(p8cVar);
            d8c d8cVarO0 = p8cVar.o0(str);
            n30 n30Var2 = this.o;
            n30 n30Var3 = this.n;
            n30 n30Var4 = this.m;
            n30 n30Var5 = this.d;
            if (d8cVarO0 != null) {
                bhc bhcVar = (bhc) p(str, d8cVarO0.a).p();
                n(str, bhcVar);
                n30Var5.put(str, q((dhc) bhcVar.j()));
                n30Var.put(str, (dhc) bhcVar.j());
                o(str, (dhc) bhcVar.j());
                n30Var4.put(str, ((dhc) bhcVar.u).I());
                n30Var3.put(str, d8cVarO0.b);
                n30Var2.put(str, d8cVarO0.c);
                return;
            }
            n30Var5.put(str, null);
            this.f.put(str, null);
            this.e.put(str, null);
            this.g.put(str, null);
            this.h.put(str, null);
            n30Var.put(str, null);
            n30Var4.put(str, null);
            n30Var3.put(str, null);
            n30Var2.put(str, null);
            this.j.put(str, null);
        }
    }

    public final void n(String str, bhc bhcVar) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        n30 n30Var = new n30();
        n30 n30Var2 = new n30();
        n30 n30Var3 = new n30();
        Iterator it = Collections.unmodifiableList(((dhc) bhcVar.u).H()).iterator();
        while (it.hasNext()) {
            hashSet.add(((vgc) it.next()).x());
        }
        tkc tkcVar = this.a;
        t7c t7cVar = tkcVar.d;
        thc thcVar = tkcVar.f;
        ufc ufcVar = wfc.V0;
        int i = 0;
        if (t7cVar.r(null, ufcVar)) {
            arrayList2.addAll(Collections.unmodifiableList(((dhc) bhcVar.u).N()));
        }
        while (i < ((dhc) bhcVar.u).C()) {
            xgc xgcVar = (xgc) ((dhc) bhcVar.u).D(i).p();
            if (xgcVar.n().isEmpty()) {
                tkc.m(thcVar);
                thcVar.i.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strN = xgcVar.n();
                arrayList = arrayList2;
                String strE = s7.e(xgcVar.n(), oh7.a, oh7.f);
                if (!TextUtils.isEmpty(strE)) {
                    xgcVar.h();
                    ((zgc) xgcVar.u).E(strE);
                    bhcVar.h();
                    ((dhc) bhcVar.u).Q(i, (zgc) xgcVar.j());
                }
                if (((zgc) xgcVar.u).y() && ((zgc) xgcVar.u).z()) {
                    n30Var.put(strN, Boolean.TRUE);
                }
                if (((zgc) xgcVar.u).A() && ((zgc) xgcVar.u).B()) {
                    n30Var2.put(xgcVar.n(), Boolean.TRUE);
                }
                if (((zgc) xgcVar.u).C()) {
                    if (((zgc) xgcVar.u).D() < 2 || ((zgc) xgcVar.u).D() > 65535) {
                        tkc.m(thcVar);
                        thcVar.i.c(xgcVar.n(), Integer.valueOf(((zgc) xgcVar.u).D()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        n30Var3.put(xgcVar.n(), Integer.valueOf(((zgc) xgcVar.u).D()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.e.put(str, hashSet);
        if (tkcVar.d.r(null, ufcVar)) {
            this.h.put(str, arrayList3);
        }
        this.f.put(str, n30Var);
        this.g.put(str, n30Var2);
        this.j.put(str, n30Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(final String str, dhc dhcVar) {
        int iG = dhcVar.G();
        hjc hjcVar = this.k;
        if (iG == 0) {
            hjcVar.e(str);
            return;
        }
        tkc tkcVar = this.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.n.b(Integer.valueOf(dhcVar.G()), "EES programs found");
        umc umcVar = (umc) dhcVar.F().get(0);
        try {
            yac yacVar = new yac();
            sec secVar = yacVar.a;
            secVar.d.a.put("internal.remoteConfig", new Callable() { // from class: sjc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    kjc kjcVar = new kjc(this.a, str);
                    uuc uucVar = new uuc("internal.remoteConfig");
                    uucVar.u.put("getValue", new qsc(uucVar, kjcVar));
                    return uucVar;
                }
            });
            secVar.d.a.put("internal.appMetadata", new Callable() { // from class: mjc
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new n4d(new qjc(this.a, str));
                }
            });
            secVar.d.a.put("internal.logger", new Callable() { // from class: ojc
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new p3d(this.a.l);
                }
            });
            yacVar.b(umcVar);
            hjcVar.d(str, yacVar);
            tkc.m(thcVar);
            phc phcVar = thcVar.n;
            phcVar.c(str, Integer.valueOf(umcVar.y().y()), "EES program loaded for appId, activities");
            for (imc imcVar : umcVar.y().x()) {
                tkc.m(thcVar);
                phcVar.b(imcVar.x(), "EES program activity");
            }
        } catch (dcc unused) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(str, "Failed to load EES program. appId");
        }
    }

    public final dhc p(String str, byte[] bArr) {
        tkc tkcVar = this.a;
        if (bArr == null) {
            return dhc.P();
        }
        try {
            dhc dhcVar = (dhc) ((bhc) qzc.R(dhc.O(), bArr)).j();
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.c(dhcVar.x() ? Long.valueOf(dhcVar.y()) : null, dhcVar.z() ? dhcVar.A() : null, "Parsed config. version, gmp_app_id");
            return dhcVar;
        } catch (RuntimeException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.i.c(thc.o(str), e, "Unable to merge remote config. appId");
            return dhc.P();
        } catch (k2c e2) {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.i.c(thc.o(str), e2, "Unable to merge remote config. appId");
            return dhc.P();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dhc s(String str) {
        h();
        g();
        a78.d(str);
        m(str);
        return (dhc) this.i.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String t(String str) {
        g();
        m(str);
        return (String) this.m.get(str);
    }

    public final void u(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        bhc bhcVar;
        byte[] bArrG;
        int i;
        int i2;
        boolean z;
        h();
        g();
        a78.d(str);
        bhc bhcVar2 = (bhc) p(str, bArr).p();
        n(str, bhcVar2);
        o(str, (dhc) bhcVar2.j());
        dhc dhcVar = (dhc) bhcVar2.j();
        n30 n30Var = this.i;
        n30Var.put(str, dhcVar);
        this.m.put(str, ((dhc) bhcVar2.u).I());
        this.n.put(str, str2);
        this.o.put(str, str3);
        this.d.put(str, q((dhc) bhcVar2.j()));
        lzc lzcVar = this.b;
        p8c p8cVar = lzcVar.c;
        lzc.U(p8cVar);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((dhc) bhcVar2.u).E()));
        tkc tkcVar = p8cVar.a;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            afc afcVar = (afc) ((bfc) arrayList.get(i3)).p();
            n30 n30Var2 = n30Var;
            if (((bfc) afcVar.u).D() != 0) {
                int i4 = 0;
                while (i4 < ((bfc) afcVar.u).D()) {
                    cfc cfcVar = (cfc) ((bfc) afcVar.u).E(i4).p();
                    cfc cfcVar2 = (cfc) cfcVar.clone();
                    lzc lzcVar2 = lzcVar;
                    bhc bhcVar3 = bhcVar2;
                    String strE = s7.e(((efc) cfcVar.u).z(), oh7.a, oh7.f);
                    if (strE != null) {
                        cfcVar2.h();
                        ((efc) cfcVar2.u).K(strE);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < ((efc) cfcVar.u).B()) {
                        gfc gfcVarC = ((efc) cfcVar.u).C(i5);
                        boolean z2 = z;
                        cfc cfcVar3 = cfcVar;
                        String strE2 = s7.e(gfcVarC.E(), m40.a, m40.b);
                        if (strE2 != null) {
                            ffc ffcVar = (ffc) gfcVarC.p();
                            ffcVar.h();
                            ((gfc) ffcVar.u).G(strE2);
                            gfc gfcVar = (gfc) ffcVar.j();
                            cfcVar2.h();
                            ((efc) cfcVar2.u).L(i5, gfcVar);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i5++;
                        cfcVar = cfcVar3;
                    }
                    if (z) {
                        afcVar.h();
                        ((bfc) afcVar.u).G(i4, (efc) cfcVar2.j());
                        arrayList.set(i3, (bfc) afcVar.j());
                    }
                    i4++;
                    lzcVar = lzcVar2;
                    bhcVar2 = bhcVar3;
                }
            }
            bhc bhcVar4 = bhcVar2;
            lzc lzcVar3 = lzcVar;
            if (((bfc) afcVar.u).A() != 0) {
                for (int i6 = 0; i6 < ((bfc) afcVar.u).A(); i6++) {
                    lfc lfcVarB = ((bfc) afcVar.u).B(i6);
                    String strE3 = s7.e(lfcVarB.z(), bw5.b, bw5.c);
                    if (strE3 != null) {
                        kfc kfcVar = (kfc) lfcVarB.p();
                        kfcVar.h();
                        ((lfc) kfcVar.u).G(strE3);
                        afcVar.h();
                        ((bfc) afcVar.u).F(i6, (lfc) kfcVar.j());
                        arrayList.set(i3, (bfc) afcVar.j());
                    }
                }
            }
            i3++;
            n30Var = n30Var2;
            lzcVar = lzcVar3;
            bhcVar2 = bhcVar4;
        }
        bhc bhcVar5 = bhcVar2;
        n30 n30Var3 = n30Var;
        lzc lzcVar4 = lzcVar;
        p8cVar.h();
        p8cVar.g();
        a78.d(str);
        SQLiteDatabase sQLiteDatabaseX = p8cVar.X();
        sQLiteDatabaseX.beginTransaction();
        try {
            p8cVar.h();
            p8cVar.g();
            a78.d(str);
            SQLiteDatabase sQLiteDatabaseX2 = p8cVar.X();
            sQLiteDatabaseX2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseX2.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                bfc bfcVar = (bfc) arrayList.get(i7);
                p8cVar.h();
                p8cVar.g();
                a78.d(str);
                a78.g(bfcVar);
                if (bfcVar.x()) {
                    int iY = bfcVar.y();
                    Iterator<E> it = bfcVar.C().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = bfcVar.z().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = bfcVar.C().iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        Iterator it4 = it3;
                                        String str4 = "filter_id";
                                        sQLiteDatabase = sQLiteDatabaseX;
                                        i = size;
                                        String str5 = "app_id";
                                        if (!zHasNext) {
                                            i2 = i8;
                                            Iterator it5 = bfcVar.z().iterator();
                                            while (it5.hasNext()) {
                                                lfc lfcVar = (lfc) it5.next();
                                                p8cVar.h();
                                                p8cVar.g();
                                                a78.d(str);
                                                a78.g(lfcVar);
                                                if (lfcVar.z().isEmpty()) {
                                                    thc thcVar = tkcVar.f;
                                                    tkc.m(thcVar);
                                                    thcVar.i.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", thc.o(str), Integer.valueOf(iY), String.valueOf(lfcVar.x() ? Integer.valueOf(lfcVar.y()) : null));
                                                } else {
                                                    byte[] bArrG2 = lfcVar.g();
                                                    Iterator it6 = it5;
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put("audience_id", Integer.valueOf(iY));
                                                    contentValues.put(str4, lfcVar.x() ? Integer.valueOf(lfcVar.y()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", lfcVar.z());
                                                    contentValues.put("session_scoped", lfcVar.D() ? Boolean.valueOf(lfcVar.E()) : null);
                                                    contentValues.put("data", bArrG2);
                                                    try {
                                                        if (p8cVar.X().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            thc thcVar2 = tkcVar.f;
                                                            tkc.m(thcVar2);
                                                            thcVar2.f.b(thc.o(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            it5 = it6;
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        thc thcVar3 = tkcVar.f;
                                                        tkc.m(thcVar3);
                                                        thcVar3.f.c(thc.o(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            efc efcVar = (efc) it4.next();
                                            p8cVar.h();
                                            p8cVar.g();
                                            a78.d(str);
                                            a78.g(efcVar);
                                            if (efcVar.z().isEmpty()) {
                                                thc thcVar4 = tkcVar.f;
                                                tkc.m(thcVar4);
                                                thcVar4.i.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", thc.o(str), Integer.valueOf(iY), String.valueOf(efcVar.x() ? Integer.valueOf(efcVar.y()) : null));
                                                i2 = i8;
                                            } else {
                                                bfc bfcVar2 = bfcVar;
                                                byte[] bArrG3 = efcVar.g();
                                                i2 = i8;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iY));
                                                contentValues2.put("filter_id", efcVar.x() ? Integer.valueOf(efcVar.y()) : null);
                                                contentValues2.put("event_name", efcVar.z());
                                                contentValues2.put("session_scoped", efcVar.H() ? Boolean.valueOf(efcVar.I()) : null);
                                                contentValues2.put("data", bArrG3);
                                                try {
                                                    if (p8cVar.X().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        thc thcVar5 = tkcVar.f;
                                                        tkc.m(thcVar5);
                                                        thcVar5.f.b(thc.o(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    it3 = it4;
                                                    sQLiteDatabaseX = sQLiteDatabase;
                                                    size = i;
                                                    bfcVar = bfcVar2;
                                                    i8 = i2;
                                                } catch (SQLiteException e2) {
                                                    thc thcVar6 = tkcVar.f;
                                                    tkc.m(thcVar6);
                                                    thcVar6.f.c(thc.o(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        p8cVar.h();
                                        p8cVar.g();
                                        a78.d(str);
                                        SQLiteDatabase sQLiteDatabaseX3 = p8cVar.X();
                                        sQLiteDatabaseX3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iY)});
                                        sQLiteDatabaseX3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iY)});
                                        break;
                                    }
                                    sQLiteDatabaseX = sQLiteDatabase;
                                    size = i;
                                    i7 = i2;
                                    break;
                                }
                                if (!((lfc) it2.next()).x()) {
                                    thc thcVar7 = tkcVar.f;
                                    tkc.m(thcVar7);
                                    thcVar7.i.c(thc.o(str), Integer.valueOf(iY), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                }
                            }
                        } else if (!((efc) it.next()).x()) {
                            thc thcVar8 = tkcVar.f;
                            tkc.m(thcVar8);
                            thcVar8.i.c(thc.o(str), Integer.valueOf(iY), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                        }
                    }
                } else {
                    thc thcVar9 = tkcVar.f;
                    tkc.m(thcVar9);
                    thcVar9.i.b(thc.o(str), "Audience with no ID. appId");
                }
                i7 = i8;
            }
            sQLiteDatabase = sQLiteDatabaseX;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                bfc bfcVar3 = (bfc) obj;
                arrayList2.add(bfcVar3.x() ? Integer.valueOf(bfcVar3.y()) : null);
            }
            a78.d(str);
            p8cVar.h();
            p8cVar.g();
            SQLiteDatabase sQLiteDatabaseX4 = p8cVar.X();
            try {
                long jC = p8cVar.C("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, tkcVar.d.p(str, wfc.U)));
                if (jC > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseX4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i10);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i10++;
                    }
                }
            } catch (SQLiteException e3) {
                thc thcVar10 = tkcVar.f;
                tkc.m(thcVar10);
                thcVar10.f.c(thc.o(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                bhcVar5.h();
                bhcVar = bhcVar5;
                try {
                    ((dhc) bhcVar.u).R();
                    bArrG = ((dhc) bhcVar.j()).g();
                } catch (RuntimeException e4) {
                    e = e4;
                    thc thcVar11 = this.a.f;
                    tkc.m(thcVar11);
                    thcVar11.i.c(thc.o(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrG = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                bhcVar = bhcVar5;
            }
            p8c p8cVar2 = lzcVar4.c;
            lzc.U(p8cVar2);
            tkc tkcVar2 = p8cVar2.a;
            a78.d(str);
            p8cVar2.g();
            p8cVar2.h();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrG);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (p8cVar2.X().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    thc thcVar12 = tkcVar2.f;
                    tkc.m(thcVar12);
                    thcVar12.f.b(thc.o(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                thc thcVar13 = tkcVar2.f;
                tkc.m(thcVar13);
                thcVar13.f.c(thc.o(str), e6, "Error storing remote config. appId");
            }
            bhcVar.h();
            ((dhc) bhcVar.u).S();
            n30Var3.put(str, (dhc) bhcVar.j());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseX;
        }
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("1".equals(d(str, "measurement.upload.blacklist_internal")) && yzc.L(str2)) {
            return true;
        }
        if ("1".equals(d(str, "measurement.upload.blacklist_public")) && yzc.h0(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean w(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List x(String str) {
        g();
        m(str);
        return (List) this.h.get(str);
    }

    public final int y(String str, String str2) {
        Integer num;
        g();
        m(str);
        Map map = (Map) this.j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean z(String str) {
        g();
        m(str);
        n30 n30Var = this.e;
        if (n30Var.get(str) != 0) {
            return ((Set) n30Var.get(str)).contains("os_version") || ((Set) n30Var.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // defpackage.fyc
    public final void j() {
    }
}
