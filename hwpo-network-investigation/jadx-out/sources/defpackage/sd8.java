package defpackage;

import com.hwpo_training_app.core.data.model.schedule.ProgramPerformanceNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.SavePerformanceResponse;
import com.hwpo_training_app.core.data.model.schedule.ScheduleDetailsResponse;
import com.hwpo_training_app.core.data.model.schedule.ScheduleResponse;
import com.hwpo_training_app.core.data.model.schedule.score.ProgramScoreNetworkEntity;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sd8 implements kd8 {
    public final s49 a;
    public final td8 b;
    public final u11 c;

    public sd8(s49 s49Var, td8 td8Var, u11 u11Var) {
        s49Var.getClass();
        td8Var.getClass();
        u11Var.getClass();
        this.a = s49Var;
        this.b = td8Var;
        this.c = u11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kd8
    public final Object a(int i, u02 u02Var) throws Throwable {
        od8 od8Var;
        if (u02Var instanceof od8) {
            od8Var = (od8) u02Var;
            int i2 = od8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                od8Var.v = i2 - Integer.MIN_VALUE;
            } else {
                od8Var = new od8(this, u02Var);
            }
        } else {
            od8Var = new od8(this, u02Var);
        }
        Object objE = od8Var.t;
        int i3 = od8Var.v;
        if (i3 == 0) {
            dv8.b(objE);
            od8Var.v = 1;
            objE = this.a.e(i, od8Var);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objE);
        }
        return ((ScheduleDetailsResponse) objE).t.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kd8
    public final Object b(int i, int i2, u02 u02Var) throws Throwable {
        ld8 ld8Var;
        if (u02Var instanceof ld8) {
            ld8Var = (ld8) u02Var;
            int i3 = ld8Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ld8Var.x = i3 - Integer.MIN_VALUE;
            } else {
                ld8Var = new ld8(this, u02Var);
            }
        } else {
            ld8Var = new ld8(this, u02Var);
        }
        Object objH = ld8Var.v;
        int i4 = ld8Var.x;
        if (i4 == 0) {
            dv8.b(objH);
            ld8Var.t = i;
            ld8Var.u = i2;
            ld8Var.x = 1;
            objH = this.a.h(i, i2, ld8Var);
            v72 v72Var = v72.t;
            if (objH == v72Var) {
                return v72Var;
            }
        } else {
            if (i4 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = ld8Var.u;
            i = ld8Var.t;
            dv8.b(objH);
        }
        ru8 ru8Var = (ru8) objH;
        if (!ru8Var.a.J) {
            throw new q45(ru8Var);
        }
        j(i, false, i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kd8
    public final Object c(LocalDate localDate, int i, u02 u02Var) throws Throwable {
        nd8 nd8Var;
        if (u02Var instanceof nd8) {
            nd8Var = (nd8) u02Var;
            int i2 = nd8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nd8Var.v = i2 - Integer.MIN_VALUE;
            } else {
                nd8Var = new nd8(this, u02Var);
            }
        } else {
            nd8Var = new nd8(this, u02Var);
        }
        Object objI = nd8Var.t;
        int i3 = nd8Var.v;
        if (i3 == 0) {
            dv8.b(objI);
            String string = localDate.toString();
            string.getClass();
            nd8Var.v = 1;
            objI = this.a.i(string, i, nd8Var);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objI);
        }
        sc8 sc8VarA = ((ScheduleDetailsResponse) objI).t.a();
        this.c.e(sc8VarA);
        return sc8VarA;
    }

    @Override // defpackage.kd8
    public final void d() {
        this.c.clear();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[LOOP:1: B:80:0x022c->B:104:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x0232  */
    /* JADX WARN: Code duplicated, block: B:85:0x025c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:94:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:0: B:68:0x01ed->B:98:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.kd8
    public final Object e(long j, long j2, u02 u02Var) throws Exception {
        pd8 pd8Var;
        long j3;
        long j4;
        Exception exc;
        long j5;
        int i;
        Iterator it;
        Iterator it2;
        Iterator it3;
        long j6;
        long j7;
        k49 k49Var;
        int i2;
        int i3;
        Object objEmit;
        Object objEmit2;
        if (u02Var instanceof pd8) {
            pd8Var = (pd8) u02Var;
            int i4 = pd8Var.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pd8Var.C = i4 - Integer.MIN_VALUE;
            } else {
                pd8Var = new pd8(this, u02Var);
            }
        } else {
            pd8Var = new pd8(this, u02Var);
        }
        pd8 pd8Var2 = pd8Var;
        Object objB = pd8Var2.A;
        int i5 = pd8Var2.C;
        v72 v72Var = v72.t;
        td8 td8Var = this.b;
        u11 u11Var = this.c;
        if (i5 == 0) {
            dv8.b(objB);
            u11Var.clear();
            qlb.a aVar = qlb.Companion;
            LocalDate localDateP = yk2.p(j);
            localDateP.getClass();
            aVar.getClass();
            List<LocalDate> list = qlb.a.a(localDateP).a;
            int iG = pi6.g(ph1.n(list, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            for (Object obj : list) {
                jd8.Companion.getClass();
                linkedHashMap.put(obj, jd8.c);
            }
            u11Var.f(linkedHashMap);
            try {
                s49 s49Var = this.a;
                pd8Var2.t = j;
                pd8Var2.u = j2;
                pd8Var2.C = 1;
                objB = s49Var.b(j, j2, pd8Var2);
                if (objB != v72Var) {
                    j3 = j;
                    j4 = j2;
                }
            } catch (Exception e) {
                e = e;
                j3 = j;
                j4 = j2;
                exc = e;
                j5 = j3;
                i = 0;
                it = u11Var.j().iterator();
                while (it.hasNext()) {
                    LocalDate localDate = (LocalDate) it.next();
                    jd8.Companion.getClass();
                    id8 id8Var = new id8(localDate, exc, jd8.c);
                    pd8Var2.v = exc;
                    pd8Var2.w = it;
                    pd8Var2.t = j5;
                    pd8Var2.u = j4;
                    pd8Var2.y = i;
                    pd8Var2.z = 0;
                    pd8Var2.C = 2;
                    objEmit = td8Var.a.emit(id8Var, pd8Var2);
                    if (objEmit != v72Var) {
                        objEmit = g2b.a;
                    }
                    if (objEmit == v72Var) {
                    }
                }
                throw exc;
            }
            return v72Var;
        }
        if (i5 == 1) {
            j4 = pd8Var2.u;
            j3 = pd8Var2.t;
            try {
                dv8.b(objB);
            } catch (Exception e2) {
                e = e2;
                exc = e;
                j5 = j3;
                i = 0;
                it = u11Var.j().iterator();
                while (it.hasNext()) {
                    LocalDate localDate2 = (LocalDate) it.next();
                    jd8.Companion.getClass();
                    id8 id8Var2 = new id8(localDate2, exc, jd8.c);
                    pd8Var2.v = exc;
                    pd8Var2.w = it;
                    pd8Var2.t = j5;
                    pd8Var2.u = j4;
                    pd8Var2.y = i;
                    pd8Var2.z = 0;
                    pd8Var2.C = 2;
                    objEmit = td8Var.a.emit(id8Var2, pd8Var2);
                    if (objEmit != v72Var) {
                        objEmit = g2b.a;
                    }
                    if (objEmit == v72Var) {
                    }
                }
                throw exc;
            }
        } else {
            if (i5 == 2) {
                i = pd8Var2.y;
                j4 = pd8Var2.u;
                j5 = pd8Var2.t;
                it = pd8Var2.w;
                exc = (Exception) pd8Var2.v;
                dv8.b(objB);
                while (it.hasNext()) {
                    LocalDate localDate3 = (LocalDate) it.next();
                    jd8.Companion.getClass();
                    id8 id8Var3 = new id8(localDate3, exc, jd8.c);
                    pd8Var2.v = exc;
                    pd8Var2.w = it;
                    pd8Var2.t = j5;
                    pd8Var2.u = j4;
                    pd8Var2.y = i;
                    pd8Var2.z = 0;
                    pd8Var2.C = 2;
                    objEmit = td8Var.a.emit(id8Var3, pd8Var2);
                    if (objEmit != v72Var) {
                        objEmit = g2b.a;
                    }
                    if (objEmit == v72Var) {
                        return v72Var;
                    }
                }
                throw exc;
            }
            if (i5 != 3) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = pd8Var2.z;
            int i7 = pd8Var2.y;
            j7 = pd8Var2.u;
            long j8 = pd8Var2.t;
            it3 = pd8Var2.x;
            k49Var = (k49) pd8Var2.v;
            dv8.b(objB);
            i2 = i6;
            j6 = j8;
            i3 = i7;
            it2 = null;
        }
        while (it3.hasNext()) {
            id8 id8Var4 = (id8) it3.next();
            pd8Var2.v = k49Var;
            pd8Var2.w = it2;
            pd8Var2.x = it3;
            pd8Var2.t = j6;
            pd8Var2.u = j7;
            pd8Var2.y = i3;
            pd8Var2.z = i2;
            pd8Var2.C = 3;
            objEmit2 = td8Var.a.emit(id8Var4, pd8Var2);
            if (objEmit2 == v72Var) {
                objEmit2 = g2b.a;
            }
            if (objEmit2 == v72Var) {
                return v72Var;
            }
        }
        return k49Var;
        ScheduleResponse scheduleResponse = (ScheduleResponse) objB;
        List<sc8> listA = g93.a(scheduleResponse.t);
        k49 k49Var2 = new k49(listA, g93.a(scheduleResponse.u));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (sc8 sc8Var : listA) {
            LocalDate localDateM = sc8Var.e.m();
            List list2 = (List) map.get(localDateM);
            ArrayList arrayList = list2 != null ? new ArrayList(list2) : new ArrayList();
            arrayList.add(sc8Var);
            map.put(localDateM, arrayList);
        }
        for (cq5 cq5Var : k49Var2.b) {
            LocalDate localDate4 = cq5Var.b;
            List list3 = (List) map2.get(localDate4);
            ArrayList arrayList2 = list3 != null ? new ArrayList(list3) : new ArrayList();
            arrayList2.add(cq5Var);
            map2.put(localDate4, arrayList2);
        }
        HashMap map3 = new HashMap();
        Set setKeySet = map.keySet();
        setKeySet.getClass();
        Set setKeySet2 = map2.keySet();
        setKeySet2.getClass();
        for (LocalDate localDate5 : wx7.b(setKeySet, setKeySet2)) {
            List list4 = (List) map.get(localDate5);
            hf3 hf3Var = hf3.t;
            if (list4 == null) {
                list4 = hf3Var;
            }
            List list5 = (List) map2.get(localDate5);
            HashMap map4 = map;
            map3.put(localDate5, new jd8(list4, list5 == null ? hf3Var : list5));
            map = map4;
        }
        u11Var.f(map3);
        Set<LocalDate> setJ = u11Var.j();
        ArrayList arrayList3 = new ArrayList(ph1.n(setJ, 10));
        for (LocalDate localDate6 : setJ) {
            arrayList3.add(new id8(localDate6, null, u11Var.g(localDate6)));
        }
        it2 = null;
        it3 = arrayList3.iterator();
        j6 = j3;
        j7 = j4;
        k49Var = k49Var2;
        i2 = 0;
        i3 = 0;
        while (it3.hasNext()) {
            id8 id8Var5 = (id8) it3.next();
            pd8Var2.v = k49Var;
            pd8Var2.w = it2;
            pd8Var2.x = it3;
            pd8Var2.t = j6;
            pd8Var2.u = j7;
            pd8Var2.y = i3;
            pd8Var2.z = i2;
            pd8Var2.C = 3;
            objEmit2 = td8Var.a.emit(id8Var5, pd8Var2);
            if (objEmit2 == v72Var) {
                objEmit2 = g2b.a;
            }
            if (objEmit2 == v72Var) {
                return v72Var;
            }
        }
        return k49Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kd8
    public final Serializable f(int i, int i2, u02 u02Var) throws Throwable {
        rd8 rd8Var;
        if (u02Var instanceof rd8) {
            rd8Var = (rd8) u02Var;
            int i3 = rd8Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rd8Var.x = i3 - Integer.MIN_VALUE;
            } else {
                rd8Var = new rd8(this, u02Var);
            }
        } else {
            rd8Var = new rd8(this, u02Var);
        }
        Object objC = rd8Var.v;
        int i4 = rd8Var.x;
        if (i4 == 0) {
            dv8.b(objC);
            rd8Var.t = i;
            rd8Var.u = i2;
            rd8Var.x = 1;
            objC = this.a.c(i, i2, rd8Var);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i4 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = rd8Var.u;
            i = rd8Var.t;
            dv8.b(objC);
        }
        ru8 ru8Var = (ru8) objC;
        if (ru8Var.a.J) {
            return (Serializable) j(i, false, i2);
        }
        throw new q45(ru8Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kd8
    public final Serializable g(int i, int i2, u02 u02Var) throws Throwable {
        md8 md8Var;
        if (u02Var instanceof md8) {
            md8Var = (md8) u02Var;
            int i3 = md8Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                md8Var.x = i3 - Integer.MIN_VALUE;
            } else {
                md8Var = new md8(this, u02Var);
            }
        } else {
            md8Var = new md8(this, u02Var);
        }
        Object objG = md8Var.v;
        int i4 = md8Var.x;
        if (i4 == 0) {
            dv8.b(objG);
            md8Var.t = i;
            md8Var.u = i2;
            md8Var.x = 1;
            objG = this.a.g(i, i2, md8Var);
            v72 v72Var = v72.t;
            if (objG == v72Var) {
                return v72Var;
            }
        } else {
            if (i4 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = md8Var.u;
            i = md8Var.t;
            dv8.b(objG);
        }
        ru8 ru8Var = (ru8) objG;
        if (ru8Var.a.J) {
            return (Serializable) j(i, true, i2);
        }
        throw new q45(ru8Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kd8
    public final Object h(int i, int i2, n17 n17Var, u02 u02Var) throws Throwable {
        qd8 qd8Var;
        if (u02Var instanceof qd8) {
            qd8Var = (qd8) u02Var;
            int i3 = qd8Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qd8Var.v = i3 - Integer.MIN_VALUE;
            } else {
                qd8Var = new qd8(this, u02Var);
            }
        } else {
            qd8Var = new qd8(this, u02Var);
        }
        Object objF = qd8Var.t;
        int i4 = qd8Var.v;
        if (i4 == 0) {
            dv8.b(objF);
            qd8Var.v = 1;
            objF = this.a.f(i, i2, n17Var, qd8Var);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
                return v72Var;
            }
        } else {
            if (i4 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objF);
        }
        SavePerformanceResponse savePerformanceResponse = (SavePerformanceResponse) objF;
        ProgramPerformanceNetworkEntity programPerformanceNetworkEntity = savePerformanceResponse.t;
        vc8 vc8Var = programPerformanceNetworkEntity != null ? new vc8(programPerformanceNetworkEntity.t, programPerformanceNetworkEntity.u, g93.a(programPerformanceNetworkEntity.v)) : null;
        ProgramScoreNetworkEntity programScoreNetworkEntity = savePerformanceResponse.u;
        return new yz8(vc8Var, programScoreNetworkEntity != null ? programScoreNetworkEntity.a() : null);
    }

    @Override // defpackage.kd8
    public final jd8 i(long j) {
        LocalDate localDateP = yk2.p(j);
        localDateP.getClass();
        return this.c.g(localDateP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    public final List j(int i, boolean z, int i2) {
        Object next;
        ?? arrayList;
        int i3;
        u11 u11Var = this.c;
        sc8 sc8VarC = u11Var.c(i);
        if (sc8VarC != null) {
            List<hd8> list = sc8VarC.f;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((hd8) next).a != i2);
            hd8 hd8Var = (hd8) next;
            if (hd8Var != null) {
                int iOrdinal = hd8Var.c.ordinal();
                if (iOrdinal == 4) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((hd8) obj).c == o89.x) {
                            arrayList.add(obj);
                        }
                    }
                } else if (iOrdinal != 5) {
                    arrayList = ws0.h(hd8Var);
                } else {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((hd8) obj2).c == o89.y) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (true) {
                    int i4 = -1;
                    i3 = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    hd8 hd8Var2 = (hd8) it2.next();
                    Iterator<hd8> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().a == hd8Var2.a) {
                            i4 = i3;
                            break;
                        }
                        i3++;
                    }
                    arrayList2.add(Integer.valueOf(i4));
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = arrayList2.get(i5);
                    i5++;
                    if (((Number) obj3).intValue() != -1) {
                        arrayList3.add(obj3);
                    }
                }
                int iG = pi6.g(ph1.n(arrayList3, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj4 = arrayList3.get(i3);
                    i3++;
                    linkedHashMap.put(obj4, hd8.a(list.get(((Number) obj4).intValue()), z, null, 32735));
                }
                LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
                if (linkedHashMap2 != null) {
                    ArrayList arrayList4 = new ArrayList(list);
                    Iterator it4 = linkedHashMap2.keySet().iterator();
                    while (it4.hasNext()) {
                        int iIntValue = ((Number) it4.next()).intValue();
                        hd8 hd8Var3 = (hd8) linkedHashMap2.get(Integer.valueOf(iIntValue));
                        if (hd8Var3 != null) {
                            arrayList4.set(iIntValue, hd8Var3);
                        }
                    }
                    int i6 = sc8VarC.a;
                    String str = sc8VarC.b;
                    a08 a08Var = sc8VarC.c;
                    Integer num = sc8VarC.d;
                    LocalDateTime localDateTime = sc8VarC.e;
                    boolean z2 = sc8VarC.g;
                    boolean z3 = sc8VarC.h;
                    str.getClass();
                    u11Var.e(new sc8(i6, str, a08Var, num, localDateTime, arrayList4, z2, z3));
                    Collection collectionValues = linkedHashMap2.values();
                    ArrayList arrayList5 = new ArrayList(ph1.n(collectionValues, 10));
                    Iterator it5 = collectionValues.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(Integer.valueOf(((hd8) it5.next()).a));
                    }
                    return arrayList5;
                }
            }
        }
        return hf3.t;
    }
}
