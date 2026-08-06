package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u9d {
    public tjc a;
    public Long b;
    public long c;
    public final /* synthetic */ z0c d;

    /* JADX WARN: Code duplicated, block: B:47:0x00f3 A[PHI: r6 r16 r17
      0x00f3: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x011e, B:46:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r16v5 tjc) = (r16v3 tjc), (r16v9 tjc) binds: [B:61:0x011e, B:46:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r17v4 long) = (r17v2 long), (r17v7 long) binds: [B:61:0x011e, B:46:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final tjc a(String str, tjc tjcVar) {
        ?? r5;
        tjc tjcVar2;
        long j;
        Cursor cursorRawQuery;
        ?? r0;
        Object obj;
        Pair pair;
        String strC = tjcVar.C();
        List listZ = tjcVar.z();
        z0c z0cVar = this.d;
        lzc lzcVar = z0cVar.b;
        lzc lzcVar2 = z0cVar.b;
        tkc tkcVar = z0cVar.a;
        lzcVar.k0();
        akc akcVarQ = qzc.q("_eid", tjcVar);
        Long l = (Long) (akcVarQ == null ? null : qzc.y(akcVarQ));
        if (l != null) {
            if (strC.equals("_ep")) {
                lzcVar.k0();
                akc akcVarQ2 = qzc.q("_en", tjcVar);
                String str2 = (String) (akcVarQ2 == null ? null : qzc.y(akcVarQ2));
                if (TextUtils.isEmpty(str2)) {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.g.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    p8c p8cVar = lzcVar.c;
                    lzc.U(p8cVar);
                    tkc tkcVar2 = p8cVar.a;
                    p8cVar.g();
                    p8cVar.h();
                    try {
                        try {
                            cursorRawQuery = p8cVar.X().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    tjcVar2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((tjc) ((rjc) qzc.R(tjc.N(), cursorRawQuery.getBlob(0))).j(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (IOException e) {
                                            thc thcVar2 = tkcVar2.f;
                                            tkc.m(thcVar2);
                                            j = 0;
                                            try {
                                                thcVar2.f.d("Failed to merge main event. appId, eventId", thc.o(str), l, e);
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                thc thcVar3 = tkcVar2.f;
                                                tkc.m(thcVar3);
                                                thcVar3.f.b(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                r0 = tjcVar2;
                                                if (r0 != 0) {
                                                }
                                                thc thcVar4 = tkcVar.f;
                                                tkc.m(thcVar4);
                                                thcVar4.g.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                                return tjcVar2;
                                            }
                                            cursorRawQuery.close();
                                            r0 = tjcVar2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j = 0;
                                        thc thcVar5 = tkcVar2.f;
                                        tkc.m(thcVar5);
                                        thcVar5.f.b(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        r0 = tjcVar2;
                                    }
                                } else {
                                    thc thcVar6 = tkcVar2.f;
                                    tkc.m(thcVar6);
                                    thcVar6.n.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    tjcVar2 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (SQLiteException e4) {
                                e = e4;
                                tjcVar2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r5 = strC;
                            if (r5 != 0) {
                                r5.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        tjcVar2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = 0;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                    if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                        thc thcVar7 = tkcVar.f;
                        tkc.m(thcVar7);
                        thcVar7.g.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return tjcVar2;
                    }
                    this.a = (tjc) obj;
                    this.c = ((Long) ((Pair) r0).second).longValue();
                    lzcVar2.k0();
                    this.b = (Long) qzc.s("_eid", this.a);
                } else {
                    j = 0;
                }
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 <= j) {
                    p8c p8cVar2 = lzcVar2.c;
                    lzc.U(p8cVar2);
                    tkc tkcVar3 = p8cVar2.a;
                    p8cVar2.g();
                    thc thcVar8 = tkcVar3.f;
                    tkc.m(thcVar8);
                    thcVar8.n.b(str, "Clearing complex main event info. appId");
                    try {
                        p8cVar2.X().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        thc thcVar9 = tkcVar3.f;
                        tkc.m(thcVar9);
                        thcVar9.f.b(e6, "Error clearing complex main event");
                    }
                } else {
                    p8c p8cVar3 = lzcVar2.c;
                    lzc.U(p8cVar3);
                    p8cVar3.y(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (akc akcVar : this.a.z()) {
                    lzcVar2.k0();
                    if (qzc.q(akcVar.y(), tjcVar) == null) {
                        arrayList.add(akcVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    thc thcVar10 = tkcVar.f;
                    tkc.m(thcVar10);
                    thcVar10.g.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listZ);
                    listZ = arrayList;
                }
                strC = str2;
            } else {
                this.b = l;
                this.a = tjcVar;
                lzcVar.k0();
                akc akcVarQ3 = qzc.q("_epc", tjcVar);
                Serializable serializableY = akcVarQ3 == null ? null : qzc.y(akcVarQ3);
                long jLongValue = ((Long) (serializableY != null ? serializableY : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    thc thcVar11 = tkcVar.f;
                    tkc.m(thcVar11);
                    thcVar11.g.b(strC, "Complex event with zero extra param count. eventName");
                } else {
                    p8c p8cVar4 = lzcVar.c;
                    lzc.U(p8cVar4);
                    p8cVar4.y(str, l, this.c, tjcVar);
                }
            }
        }
        rjc rjcVar = (rjc) tjcVar.p();
        rjcVar.u(strC);
        rjcVar.h();
        ((tjc) rjcVar.u).R();
        rjcVar.h();
        ((tjc) rjcVar.u).Q(listZ);
        return (tjc) rjcVar.j();
    }
}
