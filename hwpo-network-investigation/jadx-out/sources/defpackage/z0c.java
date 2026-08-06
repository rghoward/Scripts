package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z0c extends fyc {
    public String d;
    public HashSet e;
    public n30 f;
    public Long g;
    public Long h;

    /* JADX WARN: Code duplicated, block: B:102:0x0239 A[LOOP:20: B:85:0x01e9->B:102:0x0239, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0275  */
    /* JADX WARN: Code duplicated, block: B:123:0x0280  */
    /* JADX WARN: Code duplicated, block: B:125:0x028b  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b9 A[Catch: all -> 0x02d4, SQLiteException -> 0x02d6, LOOP:11: B:131:0x02b9->B:566:?, LOOP_START, TryCatch #5 {SQLiteException -> 0x02d6, blocks: (B:129:0x02b3, B:131:0x02b9, B:133:0x02ca, B:139:0x02d8, B:142:0x02ed), top: B:476:0x02b3 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca A[Catch: all -> 0x02d4, SQLiteException -> 0x02d6, TryCatch #5 {SQLiteException -> 0x02d6, blocks: (B:129:0x02b3, B:131:0x02b9, B:133:0x02ca, B:139:0x02d8, B:142:0x02ed), top: B:476:0x02b3 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ed A[Catch: all -> 0x02d4, SQLiteException -> 0x02d6, TRY_ENTER, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x02d6, blocks: (B:129:0x02b3, B:131:0x02b9, B:133:0x02ca, B:139:0x02d8, B:142:0x02ed), top: B:476:0x02b3 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x032a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0338  */
    /* JADX WARN: Code duplicated, block: B:164:0x034f  */
    /* JADX WARN: Code duplicated, block: B:190:0x044a  */
    /* JADX WARN: Code duplicated, block: B:194:0x045b  */
    /* JADX WARN: Code duplicated, block: B:196:0x047b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0492  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:217:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:223:0x0512  */
    /* JADX WARN: Code duplicated, block: B:226:0x051b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0527  */
    /* JADX WARN: Code duplicated, block: B:230:0x0549  */
    /* JADX WARN: Code duplicated, block: B:231:0x054d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0585  */
    /* JADX WARN: Code duplicated, block: B:249:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:252:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:255:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:262:0x0608  */
    /* JADX WARN: Code duplicated, block: B:265:0x061c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0652  */
    /* JADX WARN: Code duplicated, block: B:277:0x0693  */
    /* JADX WARN: Code duplicated, block: B:284:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:290:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:301:0x06f7 A[LOOP:8: B:278:0x0695->B:301:0x06f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:304:0x0700 A[PHI: r0 r20 r22
      0x0700: PHI (r0v77 java.util.Map) = (r0v79 java.util.Map), (r0v87 java.util.Map) binds: [B:317:0x072c, B:303:0x06fe] A[DONT_GENERATE, DONT_INLINE]
      0x0700: PHI (r20v11 android.database.Cursor) = (r20v12 android.database.Cursor), (r20v16 android.database.Cursor) binds: [B:317:0x072c, B:303:0x06fe] A[DONT_GENERATE, DONT_INLINE]
      0x0700: PHI (r22v12 r9c) = (r22v13 r9c), (r22v16 r9c) binds: [B:317:0x072c, B:303:0x06fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:323:0x0739  */
    /* JADX WARN: Code duplicated, block: B:327:0x074d  */
    /* JADX WARN: Code duplicated, block: B:333:0x077d  */
    /* JADX WARN: Code duplicated, block: B:335:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:337:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:340:0x07c2 A[LOOP:10: B:331:0x0777->B:340:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:348:0x0800  */
    /* JADX WARN: Code duplicated, block: B:351:0x0808  */
    /* JADX WARN: Code duplicated, block: B:354:0x0817  */
    /* JADX WARN: Code duplicated, block: B:356:0x082a  */
    /* JADX WARN: Code duplicated, block: B:360:0x0863 A[Catch: all -> 0x0894, SQLiteException -> 0x08a4, LOOP:3: B:360:0x0863->B:382:0x08c9, LOOP_START, PHI: r4 r7
      0x0863: PHI (r4v38 java.util.Iterator) = (r4v31 java.util.Iterator), (r4v41 java.util.Iterator) binds: [B:359:0x0861, B:382:0x08c9] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r7v50 tkc) = (r7v41 tkc), (r7v52 tkc) binds: [B:359:0x0861, B:382:0x08c9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x08a4, blocks: (B:358:0x085d, B:360:0x0863, B:361:0x0868, B:363:0x0879), top: B:483:0x085d }] */
    /* JADX WARN: Code duplicated, block: B:365:0x0889  */
    /* JADX WARN: Code duplicated, block: B:371:0x089a  */
    /* JADX WARN: Code duplicated, block: B:382:0x08c9 A[LOOP:3: B:360:0x0863->B:382:0x08c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:398:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:402:0x0906  */
    /* JADX WARN: Code duplicated, block: B:404:0x090a  */
    /* JADX WARN: Code duplicated, block: B:408:0x091a  */
    /* JADX WARN: Code duplicated, block: B:412:0x093b  */
    /* JADX WARN: Code duplicated, block: B:415:0x094c  */
    /* JADX WARN: Code duplicated, block: B:417:0x0961  */
    /* JADX WARN: Code duplicated, block: B:419:0x096f  */
    /* JADX WARN: Code duplicated, block: B:421:0x097a  */
    /* JADX WARN: Code duplicated, block: B:423:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:426:0x09af  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a20 A[PHI: r16 r38
      0x0a20: PHI (r16v18 java.lang.String) = (r16v19 java.lang.String), (r2v40 java.lang.String) binds: [B:443:0x0a1e, B:441:0x0a10] A[DONT_GENERATE, DONT_INLINE]
      0x0a20: PHI (r38v3 java.util.Map) = (r38v4 java.util.Map), (r0v122 java.util.Map) binds: [B:443:0x0a1e, B:441:0x0a10] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:449:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:462:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:465:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:535:0x08c4 A[EDGE_INSN: B:535:0x08c4->B:381:0x08c4 BREAK  A[LOOP:3: B:360:0x0863->B:382:0x08c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x092c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0a25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x09f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0a1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0aa1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x06f2 A[EDGE_INSN: B:556:0x06f2->B:300:0x06f2 BREAK  A[LOOP:8: B:278:0x0695->B:301:0x06f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x04d6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x0355 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0235 A[EDGE_INSN: B:602:0x0235->B:101:0x0235 BREAK  A[LOOP:20: B:85:0x01e9->B:102:0x0239], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8 A[Catch: all -> 0x01d4, SQLiteException -> 0x01d7, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01d7, blocks: (B:72:0x01c2, B:74:0x01c8, B:83:0x01e2), top: B:468:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e2 A[Catch: all -> 0x01d4, SQLiteException -> 0x01d7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01d7, blocks: (B:72:0x01c2, B:74:0x01c8, B:83:0x01e2), top: B:468:0x01c2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v199 */
    /* JADX WARN: Type inference failed for: r0v30, types: [ep9, n30] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2, types: [tkc] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28, types: [tkc] */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r19v29 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v32 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r3v68, types: [phc] */
    /* JADX WARN: Type inference failed for: r4v36, types: [phc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v58, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList k(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r18;
        String str3;
        Object obj2;
        ?? r22;
        Map map2;
        String str4;
        tkc tkcVar;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        glc glcVar;
        BitSet bitSet;
        BitSet bitSet2;
        n30 n30Var;
        glc glcVar2;
        n30 n30Var2;
        List<efc> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        klc klcVar;
        Long lValueOf;
        p8c p8cVarH0;
        String str6;
        ?? n30Var3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        n30 n30Var4;
        Iterator it2;
        Integer num;
        glc glcVar3;
        List list4;
        ?? r19;
        Iterator it3;
        tkc tkcVar2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        String str8;
        u9d u9dVar;
        n30 n30Var5;
        Iterator it4;
        tjc tjcVar;
        tjc tjcVarA;
        r9c r9cVarQ;
        lzc lzcVar;
        long j;
        String strC;
        Map map6;
        r9c r9cVar;
        Iterator it5;
        Integer num2;
        int iIntValue;
        Iterator it6;
        boolean z5;
        Map map7;
        Iterator it7;
        n30 n30Var6;
        long j2;
        ayb aybVar;
        int iY;
        t8d t8dVar;
        boolean z6;
        boolean zG;
        String str9;
        n30 n30Var7;
        Cursor cursor;
        String str10;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        lzc lzcVar2;
        ArrayList arrayList3;
        p8c p8cVarH1;
        tkc tkcVar3;
        String str11;
        ContentValues contentValues;
        n30 n30Var8;
        Iterator it8;
        String strZ;
        Map map8;
        Iterator it9;
        Iterator it10;
        boolean zG2;
        lfc lfcVar;
        Integer numValueOf4;
        c0c c0cVar;
        Integer numValueOf5;
        tkc tkcVar4;
        String str12;
        n30 n30Var9;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf6;
        List list6;
        List arrayList4;
        n30 n30Var10;
        int i2;
        ?? r6;
        Object obj3;
        ?? r8;
        ?? r110;
        ?? r111;
        List arrayList5;
        a78.d(str);
        a78.g(list);
        a78.g(list2);
        this.d = str;
        this.e = new HashSet();
        this.f = new n30();
        this.g = l;
        this.h = l2;
        Iterator it11 = list.iterator();
        while (true) {
            if (!it11.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((tjc) it11.next()).C())) {
                z2 = true;
                break;
            }
        }
        t5c.a();
        tkc tkcVar5 = this.a;
        boolean zR = tkcVar5.d.r(this.d, wfc.F0);
        t5c.a();
        boolean zR2 = tkcVar5.d.r(this.d, wfc.E0);
        String str13 = "events";
        lzc lzcVar3 = this.b;
        if (z2) {
            p8c p8cVarH2 = lzcVar3.h0();
            String str14 = this.d;
            p8cVarH2.h();
            p8cVarH2.g();
            a78.d(str14);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                p8cVarH2.X().update("events", contentValues2, "app_id = ?", new String[]{str14});
            } catch (SQLiteException e) {
                p8cVarH2.a.b().k().c(thc.o(str14), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str15 = "Failed to merge filter. appId";
        Object objO = "Database error querying filters. appId";
        String str16 = "audience_id";
        try {
            try {
                try {
                    if (zR2 && zR) {
                        p8c p8cVarH3 = lzcVar3.h0();
                        tkc tkcVar6 = p8cVarH3.a;
                        String str17 = this.d;
                        a78.d(str17);
                        z3 = z2;
                        n30 n30Var11 = new n30();
                        try {
                            String[] strArr = {"audience_id", "data"};
                            ?? Query = p8cVarH3.X().query("event_filters", strArr, "app_id=?", new String[]{str17}, null, null, null);
                            try {
                                try {
                                    if (Query.moveToFirst()) {
                                        str2 = "data";
                                        Query = Query;
                                        ?? r112 = strArr;
                                        while (true) {
                                            try {
                                                try {
                                                    efc efcVar = (efc) ((cfc) qzc.R(efc.J(), Query.getBlob(1))).j();
                                                    if (efcVar.D()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query.getInt(0));
                                                        List list7 = (List) n30Var11.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            n30Var11.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(efcVar);
                                                        r112 = Query;
                                                    } else {
                                                        r112 = Query;
                                                    }
                                                } catch (IOException e2) {
                                                    r112 = Query;
                                                    tkcVar6.b().k().c(thc.o(str17), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r112.moveToNext()) {
                                                        break;
                                                    }
                                                    Query = r112;
                                                    r112 = r112;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r111 = r112;
                                                    r8 = r111;
                                                    try {
                                                        tkcVar6.b().k().c(thc.o(str17), e, "Database error querying filters. appId");
                                                        map9 = Collections.EMPTY_MAP;
                                                        if (r8 != 0) {
                                                            r8.close();
                                                        }
                                                        map = map9;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r8 != 0) {
                                                            r8.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r110 = r112;
                                                    r8 = r110;
                                                    if (r8 != 0) {
                                                        r8.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r111 = Query;
                                                r8 = r111;
                                                tkcVar6.b().k().c(thc.o(str17), e, "Database error querying filters. appId");
                                                map9 = Collections.EMPTY_MAP;
                                                if (r8 != 0) {
                                                    r8.close();
                                                }
                                                map = map9;
                                                p8c p8cVarH4 = lzcVar3.h0();
                                                obj = p8cVarH4.a;
                                                r5 = this.d;
                                                p8cVarH4.h();
                                                p8cVarH4.g();
                                                a78.d(r5);
                                                cursorQuery = p8cVarH4.X().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    n30Var10 = new n30();
                                                    r18 = obj;
                                                    r22 = r5;
                                                    while (true) {
                                                        try {
                                                            i2 = cursorQuery.getInt(0);
                                                            try {
                                                                glc glcVar4 = (glc) ((elc) qzc.R(glc.F(), cursorQuery.getBlob(1))).j();
                                                                Integer numValueOf8 = Integer.valueOf(i2);
                                                                n30Var10.put(numValueOf8, glcVar4);
                                                                str3 = str15;
                                                                obj2 = objO;
                                                                obj3 = numValueOf8;
                                                                r6 = r22;
                                                            } catch (IOException e5) {
                                                                phc phcVarK = r18.b().k();
                                                                str3 = str15;
                                                                str15 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objO;
                                                                try {
                                                                    objO = thc.o(r22);
                                                                    Integer numValueOf9 = Integer.valueOf(i2);
                                                                    phcVarK.d("Failed to merge filter results. appId, audienceId, error", objO, numValueOf9, e5);
                                                                    obj3 = phcVarK;
                                                                    r6 = numValueOf9;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r22 = r22;
                                                                    r18.b().k().c(thc.o(r22), e, "Database error querying filter results. appId");
                                                                    Map map10 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map10;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        tkcVar = tkcVar5;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str18 = this.d;
                                                                            p8cVarH0 = lzcVar3.h0();
                                                                            str6 = this.d;
                                                                            p8cVarH0.h();
                                                                            p8cVarH0.g();
                                                                            a78.d(str6);
                                                                            n30Var3 = new n30();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = p8cVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) n30Var3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    n30Var3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            n30Var3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        p8cVarH0.a.b().k().c(thc.o(str6), e, "Database error querying scoped filters. appId");
                                                                                        n30Var3 = Collections.EMPTY_MAP;
                                                                                        r0 = n30Var3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        a78.d(str18);
                                                                                        n30Var4 = new n30();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                glcVar3 = (glc) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r19 = r0;
                                                                                                it3 = it2;
                                                                                                tkcVar2 = tkcVar5;
                                                                                                n30Var4.put(num, glcVar3);
                                                                                                r0 = r19;
                                                                                                str16 = str16;
                                                                                                it2 = it3;
                                                                                                tkcVar5 = tkcVar2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str16;
                                                                                        tkcVar = tkcVar5;
                                                                                        map3 = n30Var4;
                                                                                        map5 = map2;
                                                                                        map4 = map3;
                                                                                        for (Integer num3 : hashSet) {
                                                                                            num3.getClass();
                                                                                            glcVar = (glc) map4.get(num3);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            n30Var = new n30();
                                                                                            if (glcVar != null) {
                                                                                                for (pjc pjcVar : glcVar.B()) {
                                                                                                    if (pjcVar.x()) {
                                                                                                        glc glcVar5 = glcVar;
                                                                                                        Integer numValueOf10 = Integer.valueOf(pjcVar.y());
                                                                                                        if (pjcVar.z()) {
                                                                                                            lValueOf = Long.valueOf(pjcVar.A());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        n30Var.put(numValueOf10, lValueOf);
                                                                                                        glcVar = glcVar5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            glcVar2 = glcVar;
                                                                                            n30Var2 = new n30();
                                                                                            if (glcVar2 != null) {
                                                                                                it = glcVar2.D().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    klcVar = (klc) it.next();
                                                                                                    if (!klcVar.x()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map11 = map4;
                                                                                            if (glcVar2 != null) {
                                                                                                i = 0;
                                                                                                while (i < glcVar2.y() * 64) {
                                                                                                    if (qzc.L((h2c) glcVar2.x(), i)) {
                                                                                                        z4 = zR;
                                                                                                        tkcVar.b().n().c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (qzc.L((h2c) glcVar2.z(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zR = z4;
                                                                                                    } else {
                                                                                                        z4 = zR;
                                                                                                    }
                                                                                                    n30Var.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zR = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z7 = zR;
                                                                                            glc glcVar6 = (glc) map5.get(num3);
                                                                                            if (zR2) {
                                                                                                for (efc efcVar2 : list3) {
                                                                                                    int iY2 = efcVar2.y();
                                                                                                    Integer num4 = num3;
                                                                                                    jLongValue = this.h.longValue() / 1000;
                                                                                                    if (efcVar2.G()) {
                                                                                                        jLongValue = this.g.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iY2);
                                                                                                    if (n30Var.containsKey(numValueOf)) {
                                                                                                        n30Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (n30Var2.containsKey(numValueOf)) {
                                                                                                        n30Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num3 = num4;
                                                                                                }
                                                                                            }
                                                                                            String str19 = str3;
                                                                                            this.f.put(num3, new t8d(this, this.d, glcVar6, bitSet, bitSet2, n30Var, n30Var2));
                                                                                            map = map;
                                                                                            zR = z7;
                                                                                            str2 = str2;
                                                                                            map5 = map5;
                                                                                            str4 = str4;
                                                                                            zR2 = zR2;
                                                                                            str3 = str19;
                                                                                            map4 = map11;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str20 = str3;
                                                                                        ?? r9 = obj2;
                                                                                        str8 = "Skipping failed audience ID";
                                                                                        if (!list.isEmpty()) {
                                                                                            u9dVar = new u9d(this);
                                                                                            n30Var5 = new n30();
                                                                                            it4 = list.iterator();
                                                                                            while (it4.hasNext()) {
                                                                                                tjcVar = (tjc) it4.next();
                                                                                                tjcVarA = u9dVar.a(this.d, tjcVar);
                                                                                                if (tjcVarA != null) {
                                                                                                    r9cVarQ = lzcVar3.h0().Q(this.d, tjcVar, tjcVarA.C());
                                                                                                    lzcVar3.h0().H(str13, r9cVarQ);
                                                                                                    if (!z) {
                                                                                                        String str21 = str13;
                                                                                                        lzcVar = lzcVar3;
                                                                                                        j = r9cVarQ.c;
                                                                                                        strC = tjcVarA.C();
                                                                                                        map6 = (Map) n30Var5.get(strC);
                                                                                                        if (map6 == null) {
                                                                                                            p8c p8cVarH5 = lzcVar.h0();
                                                                                                            tkc tkcVar7 = p8cVarH5.a;
                                                                                                            str9 = this.d;
                                                                                                            p8cVarH5.h();
                                                                                                            p8cVarH5.g();
                                                                                                            a78.d(str9);
                                                                                                            a78.d(strC);
                                                                                                            n30Var7 = new n30();
                                                                                                            try {
                                                                                                                try {
                                                                                                                    str10 = str9;
                                                                                                                    try {
                                                                                                                        cursorQuery2 = p8cVarH5.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strC}, null, null, null);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                                    r9cVar = r9cVarQ;
                                                                                                                                    while (true) {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                efc efcVar3 = (efc) ((cfc) qzc.R(efc.J(), cursorQuery2.getBlob(1))).j();
                                                                                                                                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                                list5 = (List) n30Var7.get(numValueOf3);
                                                                                                                                                if (list5 == null) {
                                                                                                                                                    cursor2 = cursorQuery2;
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            arrayList2 = new ArrayList();
                                                                                                                                                            n30Var7.put(numValueOf3, arrayList2);
                                                                                                                                                        } catch (Throwable th3) {
                                                                                                                                                            th = th3;
                                                                                                                                                            cursor = cursor2;
                                                                                                                                                            if (cursor != null) {
                                                                                                                                                                cursor.close();
                                                                                                                                                            }
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } catch (SQLiteException e8) {
                                                                                                                                                        e = e8;
                                                                                                                                                        tkcVar7.b().k().c(thc.o(str10), e, r9);
                                                                                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                                                                                        if (cursor2 != null) {
                                                                                                                                                            cursor2.close();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    cursor2 = cursorQuery2;
                                                                                                                                                    arrayList2 = list5;
                                                                                                                                                }
                                                                                                                                                arrayList2.add(efcVar3);
                                                                                                                                            } catch (IOException e9) {
                                                                                                                                                cursor2 = cursorQuery2;
                                                                                                                                                tkcVar7.b().k().c(thc.o(str10), e9, str20);
                                                                                                                                            }
                                                                                                                                            if (!cursor2.moveToNext()) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            cursorQuery2 = cursor2;
                                                                                                                                        } catch (SQLiteException e10) {
                                                                                                                                            e = e10;
                                                                                                                                            cursor2 = cursorQuery2;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    cursor2.close();
                                                                                                                                    map6 = n30Var7;
                                                                                                                                } else {
                                                                                                                                    cursor2 = cursorQuery2;
                                                                                                                                    r9cVar = r9cVarQ;
                                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                                    cursor2.close();
                                                                                                                                }
                                                                                                                            } catch (SQLiteException e11) {
                                                                                                                                e = e11;
                                                                                                                                cursor2 = cursorQuery2;
                                                                                                                                r9cVar = r9cVarQ;
                                                                                                                            }
                                                                                                                        } catch (Throwable th4) {
                                                                                                                            th = th4;
                                                                                                                            cursor2 = cursorQuery2;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e12) {
                                                                                                                        e = e12;
                                                                                                                        r9cVar = r9cVarQ;
                                                                                                                        cursor2 = null;
                                                                                                                        tkcVar7.b().k().c(thc.o(str10), e, r9);
                                                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                                                        if (cursor2 != null) {
                                                                                                                            cursor2.close();
                                                                                                                        }
                                                                                                                        n30Var5.put(strC, map6);
                                                                                                                        it5 = map6.keySet().iterator();
                                                                                                                        while (it5.hasNext()) {
                                                                                                                            num2 = (Integer) it5.next();
                                                                                                                            iIntValue = num2.intValue();
                                                                                                                            if (this.e.contains(num2)) {
                                                                                                                                tkcVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                                                            } else {
                                                                                                                                it6 = ((List) map6.get(num2)).iterator();
                                                                                                                                z5 = true;
                                                                                                                                while (true) {
                                                                                                                                    if (!it6.hasNext()) {
                                                                                                                                        map7 = map6;
                                                                                                                                        it7 = it5;
                                                                                                                                        n30Var6 = n30Var5;
                                                                                                                                        j2 = j;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    map7 = map6;
                                                                                                                                    efc efcVar4 = (efc) it6.next();
                                                                                                                                    it7 = it5;
                                                                                                                                    n30Var6 = n30Var5;
                                                                                                                                    aybVar = new ayb(this, this.d, iIntValue, efcVar4);
                                                                                                                                    Long l3 = this.g;
                                                                                                                                    Long l4 = this.h;
                                                                                                                                    iY = efcVar4.y();
                                                                                                                                    t8dVar = (t8d) this.f.get(num2);
                                                                                                                                    if (t8dVar == null) {
                                                                                                                                        z6 = false;
                                                                                                                                    } else {
                                                                                                                                        z6 = t8dVar.d.get(iY);
                                                                                                                                    }
                                                                                                                                    j2 = j;
                                                                                                                                    zG = aybVar.g(l3, l4, tjcVarA, j2, r9cVar, z6);
                                                                                                                                    if (!zG) {
                                                                                                                                        this.e.add(num2);
                                                                                                                                        z5 = zG;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    l(num2).a(aybVar);
                                                                                                                                    z5 = zG;
                                                                                                                                    j = j2;
                                                                                                                                    map6 = map7;
                                                                                                                                    it5 = it7;
                                                                                                                                    n30Var5 = n30Var6;
                                                                                                                                }
                                                                                                                                if (!z5) {
                                                                                                                                    this.e.add(num2);
                                                                                                                                }
                                                                                                                                j = j2;
                                                                                                                                map6 = map7;
                                                                                                                                it5 = it7;
                                                                                                                                n30Var5 = n30Var6;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        it4 = it4;
                                                                                                                        str13 = str21;
                                                                                                                        lzcVar3 = lzcVar;
                                                                                                                        u9dVar = u9dVar;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e13) {
                                                                                                                    e = e13;
                                                                                                                    str10 = str9;
                                                                                                                }
                                                                                                                n30Var5.put(strC, map6);
                                                                                                            } catch (Throwable th5) {
                                                                                                                th = th5;
                                                                                                                cursor = null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            r9cVar = r9cVarQ;
                                                                                                        }
                                                                                                        it5 = map6.keySet().iterator();
                                                                                                        while (it5.hasNext()) {
                                                                                                            num2 = (Integer) it5.next();
                                                                                                            iIntValue = num2.intValue();
                                                                                                            if (this.e.contains(num2)) {
                                                                                                                tkcVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it6 = ((List) map6.get(num2)).iterator();
                                                                                                                z5 = true;
                                                                                                                while (true) {
                                                                                                                    if (!it6.hasNext()) {
                                                                                                                        map7 = map6;
                                                                                                                        it7 = it5;
                                                                                                                        n30Var6 = n30Var5;
                                                                                                                        j2 = j;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    map7 = map6;
                                                                                                                    efc efcVar5 = (efc) it6.next();
                                                                                                                    it7 = it5;
                                                                                                                    n30Var6 = n30Var5;
                                                                                                                    aybVar = new ayb(this, this.d, iIntValue, efcVar5);
                                                                                                                    Long l5 = this.g;
                                                                                                                    Long l6 = this.h;
                                                                                                                    iY = efcVar5.y();
                                                                                                                    t8dVar = (t8d) this.f.get(num2);
                                                                                                                    if (t8dVar == null) {
                                                                                                                        z6 = false;
                                                                                                                    } else {
                                                                                                                        z6 = t8dVar.d.get(iY);
                                                                                                                    }
                                                                                                                    j2 = j;
                                                                                                                    zG = aybVar.g(l5, l6, tjcVarA, j2, r9cVar, z6);
                                                                                                                    if (!zG) {
                                                                                                                        this.e.add(num2);
                                                                                                                        z5 = zG;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    l(num2).a(aybVar);
                                                                                                                    z5 = zG;
                                                                                                                    j = j2;
                                                                                                                    map6 = map7;
                                                                                                                    it5 = it7;
                                                                                                                    n30Var5 = n30Var6;
                                                                                                                }
                                                                                                                if (!z5) {
                                                                                                                    this.e.add(num2);
                                                                                                                }
                                                                                                                j = j2;
                                                                                                                map6 = map7;
                                                                                                                it5 = it7;
                                                                                                                n30Var5 = n30Var6;
                                                                                                            }
                                                                                                        }
                                                                                                        it4 = it4;
                                                                                                        str13 = str21;
                                                                                                        lzcVar3 = lzcVar;
                                                                                                        u9dVar = u9dVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        lzcVar2 = lzcVar3;
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            n30Var8 = new n30();
                                                                                            it8 = list2.iterator();
                                                                                            while (it8.hasNext()) {
                                                                                                bmc bmcVar = (bmc) it8.next();
                                                                                                strZ = bmcVar.z();
                                                                                                map8 = (Map) n30Var8.get(strZ);
                                                                                                if (map8 == null) {
                                                                                                    p8c p8cVarH6 = lzcVar2.h0();
                                                                                                    tkcVar4 = p8cVarH6.a;
                                                                                                    str12 = this.d;
                                                                                                    p8cVarH6.h();
                                                                                                    p8cVarH6.g();
                                                                                                    a78.d(str12);
                                                                                                    a78.d(strZ);
                                                                                                    n30Var9 = new n30();
                                                                                                    try {
                                                                                                        cursorQuery3 = p8cVarH6.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strZ}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            lfc lfcVar2 = (lfc) ((kfc) qzc.R(lfc.F(), cursorQuery3.getBlob(1))).j();
                                                                                                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) n30Var9.get(numValueOf6);
                                                                                                                            if (list6 == null) {
                                                                                                                                it9 = it8;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    n30Var9.put(numValueOf6, arrayList4);
                                                                                                                                } catch (SQLiteException e14) {
                                                                                                                                    e = e14;
                                                                                                                                    tkcVar4 = tkcVar4;
                                                                                                                                    cursor3 = cursorQuery3;
                                                                                                                                    try {
                                                                                                                                        tkcVar4.b().k().c(thc.o(str12), e, r9);
                                                                                                                                        map8 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        n30Var8.put(strZ, map8);
                                                                                                                                        for (Integer num5 : map8.keySet()) {
                                                                                                                                            int iIntValue2 = num5.intValue();
                                                                                                                                            if (this.e.contains(num5)) {
                                                                                                                                                tkcVar.b().n().b(num5, str8);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            it10 = ((List) map8.get(num5)).iterator();
                                                                                                                                            zG2 = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (it10.hasNext()) {
                                                                                                                                                    lfcVar = (lfc) it10.next();
                                                                                                                                                    if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                                                                                                                                        phc phcVarN = tkcVar.b().n();
                                                                                                                                                        if (lfcVar.x()) {
                                                                                                                                                            numValueOf5 = Integer.valueOf(lfcVar.y());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf5 = null;
                                                                                                                                                        }
                                                                                                                                                        phcVarN.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                                                                                                                                        tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                                                                                                                                                    }
                                                                                                                                                    if (lfcVar.x()) {
                                                                                                                                                    }
                                                                                                                                                    phc phcVarL = tkcVar.b().l();
                                                                                                                                                    rhc rhcVarO = thc.o(this.d);
                                                                                                                                                    if (lfcVar.x()) {
                                                                                                                                                        numValueOf4 = Integer.valueOf(lfcVar.y());
                                                                                                                                                    } else {
                                                                                                                                                        numValueOf4 = null;
                                                                                                                                                    }
                                                                                                                                                    phcVarL.c(rhcVarO, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                                                                                    this.e.add(num5);
                                                                                                                                                    map8 = map8;
                                                                                                                                                    str8 = str8;
                                                                                                                                                } else {
                                                                                                                                                    map8 = map8;
                                                                                                                                                    str8 = str8;
                                                                                                                                                }
                                                                                                                                                if (!zG2) {
                                                                                                                                                    this.e.add(num5);
                                                                                                                                                }
                                                                                                                                                map8 = map8;
                                                                                                                                                str8 = str8;
                                                                                                                                                l(num5).a(c0cVar);
                                                                                                                                                map8 = map8;
                                                                                                                                                str8 = str8;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        it8 = it9;
                                                                                                                                    } catch (Throwable th6) {
                                                                                                                                        th = th6;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                it9 = it8;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(lfcVar2);
                                                                                                                        } catch (IOException e15) {
                                                                                                                            it9 = it8;
                                                                                                                            tkcVar4.b().k().c(thc.o(str12), e15, "Failed to merge filter");
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (!cursorQuery3.moveToNext()) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            it8 = it9;
                                                                                                                            tkcVar4 = tkcVar4;
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            cursor3 = cursorQuery3;
                                                                                                                            tkcVar4.b().k().c(thc.o(str12), e, r9);
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor3 != null) {
                                                                                                                                cursor3.close();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery3.close();
                                                                                                                    map8 = n30Var9;
                                                                                                                } else {
                                                                                                                    it9 = it8;
                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery3.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it9 = it8;
                                                                                                            }
                                                                                                        } catch (Throwable th7) {
                                                                                                            th = th7;
                                                                                                            cursor3 = cursorQuery3;
                                                                                                            if (cursor3 != null) {
                                                                                                                cursor3.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it9 = it8;
                                                                                                        tkcVar4 = tkcVar4;
                                                                                                        cursor3 = null;
                                                                                                    } catch (Throwable th8) {
                                                                                                        th = th8;
                                                                                                        cursor3 = null;
                                                                                                    }
                                                                                                    n30Var8.put(strZ, map8);
                                                                                                } else {
                                                                                                    it9 = it8;
                                                                                                }
                                                                                                while (r4.hasNext()) {
                                                                                                    int iIntValue3 = num5.intValue();
                                                                                                    if (this.e.contains(num5)) {
                                                                                                        tkcVar.b().n().b(num5, str8);
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it10 = ((List) map8.get(num5)).iterator();
                                                                                                    zG2 = true;
                                                                                                    while (true) {
                                                                                                        if (it10.hasNext()) {
                                                                                                            lfcVar = (lfc) it10.next();
                                                                                                            if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                                                                                                phc phcVarN2 = tkcVar.b().n();
                                                                                                                if (lfcVar.x()) {
                                                                                                                    numValueOf5 = Integer.valueOf(lfcVar.y());
                                                                                                                } else {
                                                                                                                    numValueOf5 = null;
                                                                                                                }
                                                                                                                phcVarN2.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                                                                                                tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                                                                                                            }
                                                                                                            if (lfcVar.x()) {
                                                                                                            }
                                                                                                            phc phcVarL2 = tkcVar.b().l();
                                                                                                            rhc rhcVarO2 = thc.o(this.d);
                                                                                                            if (lfcVar.x()) {
                                                                                                                numValueOf4 = Integer.valueOf(lfcVar.y());
                                                                                                            } else {
                                                                                                                numValueOf4 = null;
                                                                                                            }
                                                                                                            phcVarL2.c(rhcVarO2, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                                            this.e.add(num5);
                                                                                                            map8 = map8;
                                                                                                            str8 = str8;
                                                                                                        } else {
                                                                                                            map8 = map8;
                                                                                                            str8 = str8;
                                                                                                        }
                                                                                                        if (!zG2) {
                                                                                                            this.e.add(num5);
                                                                                                        }
                                                                                                        map8 = map8;
                                                                                                        str8 = str8;
                                                                                                        l(num5).a(c0cVar);
                                                                                                        map8 = map8;
                                                                                                        str8 = str8;
                                                                                                    }
                                                                                                }
                                                                                                it8 = it9;
                                                                                            }
                                                                                        }
                                                                                        arrayList3 = new ArrayList();
                                                                                        n30.c<Integer> cVar = (n30.c) this.f.keySet();
                                                                                        cVar.removeAll(this.e);
                                                                                        for (Integer num6 : cVar) {
                                                                                            int iIntValue4 = num6.intValue();
                                                                                            t8d t8dVar2 = (t8d) this.f.get(num6);
                                                                                            a78.g(t8dVar2);
                                                                                            yic yicVarB = t8dVar2.b(iIntValue4);
                                                                                            arrayList3.add(yicVarB);
                                                                                            p8cVarH1 = lzcVar2.h0();
                                                                                            tkcVar3 = p8cVarH1.a;
                                                                                            str11 = this.d;
                                                                                            glc glcVarZ = yicVarB.z();
                                                                                            p8cVarH1.h();
                                                                                            p8cVarH1.g();
                                                                                            a78.d(str11);
                                                                                            a78.g(glcVarZ);
                                                                                            byte[] bArrG = glcVarZ.g();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str11);
                                                                                            contentValues.put(str5, num6);
                                                                                            contentValues.put("current_results", bArrG);
                                                                                            try {
                                                                                                try {
                                                                                                    if (p8cVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        tkcVar3.b().k().b(thc.o(str11), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    tkcVar3.b().k().c(thc.o(str11), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList3;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th9) {
                                                                                    th = th9;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = n30Var3;
                                                                                a78.d(str18);
                                                                                n30Var4 = new n30();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        glcVar3 = (glc) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r19 = r0;
                                                                                        it3 = it2;
                                                                                        tkcVar2 = tkcVar5;
                                                                                        n30Var4.put(num, glcVar3);
                                                                                        r0 = r19;
                                                                                        str16 = str16;
                                                                                        it2 = it3;
                                                                                        tkcVar5 = tkcVar2;
                                                                                    }
                                                                                }
                                                                                str4 = str16;
                                                                                tkcVar = tkcVar5;
                                                                                map3 = n30Var4;
                                                                            } catch (Throwable th10) {
                                                                                th = th10;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            tkcVar = tkcVar5;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map2;
                                                                        map4 = map3;
                                                                        while (r16.hasNext()) {
                                                                            num3.getClass();
                                                                            glcVar = (glc) map4.get(num3);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            n30Var = new n30();
                                                                            if (glcVar != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (pjcVar.x()) {
                                                                                        glc glcVar7 = glcVar;
                                                                                        Integer numValueOf11 = Integer.valueOf(pjcVar.y());
                                                                                        if (pjcVar.z()) {
                                                                                            lValueOf = Long.valueOf(pjcVar.A());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        n30Var.put(numValueOf11, lValueOf);
                                                                                        glcVar = glcVar7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            glcVar2 = glcVar;
                                                                            n30Var2 = new n30();
                                                                            if (glcVar2 != null) {
                                                                                it = glcVar2.D().iterator();
                                                                                while (it.hasNext()) {
                                                                                    klcVar = (klc) it.next();
                                                                                    if (!klcVar.x()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map12 = map4;
                                                                            if (glcVar2 != null) {
                                                                                i = 0;
                                                                                while (i < glcVar2.y() * 64) {
                                                                                    if (qzc.L((h2c) glcVar2.x(), i)) {
                                                                                        z4 = zR;
                                                                                        tkcVar.b().n().c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (qzc.L((h2c) glcVar2.z(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zR = z4;
                                                                                    } else {
                                                                                        z4 = zR;
                                                                                    }
                                                                                    n30Var.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zR = z4;
                                                                                }
                                                                            }
                                                                            boolean z8 = zR;
                                                                            glc glcVar8 = (glc) map5.get(num3);
                                                                            if (zR2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iY3 = efcVar2.y();
                                                                                    Integer num7 = num3;
                                                                                    jLongValue = this.h.longValue() / 1000;
                                                                                    if (efcVar2.G()) {
                                                                                        jLongValue = this.g.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iY3);
                                                                                    if (n30Var.containsKey(numValueOf)) {
                                                                                        n30Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (n30Var2.containsKey(numValueOf)) {
                                                                                        n30Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num3 = num7;
                                                                                }
                                                                            }
                                                                            String str110 = str3;
                                                                            this.f.put(num3, new t8d(this, this.d, glcVar8, bitSet, bitSet2, n30Var, n30Var2));
                                                                            map = map;
                                                                            zR = z8;
                                                                            str2 = str2;
                                                                            map5 = map5;
                                                                            str4 = str4;
                                                                            zR2 = zR2;
                                                                            str3 = str110;
                                                                            map4 = map12;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str22 = str3;
                                                                    ?? r10 = obj2;
                                                                    str8 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        u9dVar = new u9d(this);
                                                                        n30Var5 = new n30();
                                                                        it4 = list.iterator();
                                                                        while (it4.hasNext()) {
                                                                            tjcVar = (tjc) it4.next();
                                                                            tjcVarA = u9dVar.a(this.d, tjcVar);
                                                                            if (tjcVarA != null) {
                                                                                r9cVarQ = lzcVar3.h0().Q(this.d, tjcVar, tjcVarA.C());
                                                                                lzcVar3.h0().H(str13, r9cVarQ);
                                                                                if (!z) {
                                                                                    String str23 = str13;
                                                                                    lzcVar = lzcVar3;
                                                                                    j = r9cVarQ.c;
                                                                                    strC = tjcVarA.C();
                                                                                    map6 = (Map) n30Var5.get(strC);
                                                                                    if (map6 == null) {
                                                                                        p8c p8cVarH7 = lzcVar.h0();
                                                                                        tkc tkcVar8 = p8cVarH7.a;
                                                                                        str9 = this.d;
                                                                                        p8cVarH7.h();
                                                                                        p8cVarH7.g();
                                                                                        a78.d(str9);
                                                                                        a78.d(strC);
                                                                                        n30Var7 = new n30();
                                                                                        str10 = str9;
                                                                                        cursorQuery2 = p8cVarH7.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strC}, null, null, null);
                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                            r9cVar = r9cVarQ;
                                                                                            while (true) {
                                                                                                efc efcVar6 = (efc) ((cfc) qzc.R(efc.J(), cursorQuery2.getBlob(1))).j();
                                                                                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                list5 = (List) n30Var7.get(numValueOf3);
                                                                                                if (list5 == null) {
                                                                                                    cursor2 = cursorQuery2;
                                                                                                    arrayList2 = new ArrayList();
                                                                                                    n30Var7.put(numValueOf3, arrayList2);
                                                                                                } else {
                                                                                                    cursor2 = cursorQuery2;
                                                                                                    arrayList2 = list5;
                                                                                                }
                                                                                                arrayList2.add(efcVar6);
                                                                                                if (!cursor2.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                cursorQuery2 = cursor2;
                                                                                            }
                                                                                            cursor2.close();
                                                                                            map6 = n30Var7;
                                                                                        } else {
                                                                                            cursor2 = cursorQuery2;
                                                                                            r9cVar = r9cVarQ;
                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                            cursor2.close();
                                                                                        }
                                                                                        n30Var5.put(strC, map6);
                                                                                    } else {
                                                                                        r9cVar = r9cVarQ;
                                                                                    }
                                                                                    it5 = map6.keySet().iterator();
                                                                                    while (it5.hasNext()) {
                                                                                        num2 = (Integer) it5.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.e.contains(num2)) {
                                                                                            tkcVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it6 = ((List) map6.get(num2)).iterator();
                                                                                            z5 = true;
                                                                                            while (true) {
                                                                                                if (!it6.hasNext()) {
                                                                                                    map7 = map6;
                                                                                                    it7 = it5;
                                                                                                    n30Var6 = n30Var5;
                                                                                                    j2 = j;
                                                                                                    break;
                                                                                                }
                                                                                                map7 = map6;
                                                                                                efc efcVar7 = (efc) it6.next();
                                                                                                it7 = it5;
                                                                                                n30Var6 = n30Var5;
                                                                                                aybVar = new ayb(this, this.d, iIntValue, efcVar7);
                                                                                                Long l7 = this.g;
                                                                                                Long l8 = this.h;
                                                                                                iY = efcVar7.y();
                                                                                                t8dVar = (t8d) this.f.get(num2);
                                                                                                if (t8dVar == null) {
                                                                                                    z6 = false;
                                                                                                } else {
                                                                                                    z6 = t8dVar.d.get(iY);
                                                                                                }
                                                                                                j2 = j;
                                                                                                zG = aybVar.g(l7, l8, tjcVarA, j2, r9cVar, z6);
                                                                                                if (!zG) {
                                                                                                    this.e.add(num2);
                                                                                                    z5 = zG;
                                                                                                    break;
                                                                                                }
                                                                                                l(num2).a(aybVar);
                                                                                                z5 = zG;
                                                                                                j = j2;
                                                                                                map6 = map7;
                                                                                                it5 = it7;
                                                                                                n30Var5 = n30Var6;
                                                                                            }
                                                                                            if (!z5) {
                                                                                                this.e.add(num2);
                                                                                            }
                                                                                            j = j2;
                                                                                            map6 = map7;
                                                                                            it5 = it7;
                                                                                            n30Var5 = n30Var6;
                                                                                        }
                                                                                    }
                                                                                    it4 = it4;
                                                                                    str13 = str23;
                                                                                    lzcVar3 = lzcVar;
                                                                                    u9dVar = u9dVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    lzcVar2 = lzcVar3;
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        n30Var8 = new n30();
                                                                        it8 = list2.iterator();
                                                                        while (it8.hasNext()) {
                                                                            bmc bmcVar2 = (bmc) it8.next();
                                                                            strZ = bmcVar2.z();
                                                                            map8 = (Map) n30Var8.get(strZ);
                                                                            if (map8 == null) {
                                                                                p8c p8cVarH8 = lzcVar2.h0();
                                                                                tkcVar4 = p8cVarH8.a;
                                                                                str12 = this.d;
                                                                                p8cVarH8.h();
                                                                                p8cVarH8.g();
                                                                                a78.d(str12);
                                                                                a78.d(strZ);
                                                                                n30Var9 = new n30();
                                                                                cursorQuery3 = p8cVarH8.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strZ}, null, null, null);
                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                    while (true) {
                                                                                        lfc lfcVar3 = (lfc) ((kfc) qzc.R(lfc.F(), cursorQuery3.getBlob(1))).j();
                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                        list6 = (List) n30Var9.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            it9 = it8;
                                                                                            arrayList4 = new ArrayList();
                                                                                            n30Var9.put(numValueOf6, arrayList4);
                                                                                        } else {
                                                                                            it9 = it8;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(lfcVar3);
                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        it8 = it9;
                                                                                        tkcVar4 = tkcVar4;
                                                                                    }
                                                                                    cursorQuery3.close();
                                                                                    map8 = n30Var9;
                                                                                } else {
                                                                                    it9 = it8;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    cursorQuery3.close();
                                                                                }
                                                                                n30Var8.put(strZ, map8);
                                                                            } else {
                                                                                it9 = it8;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue5 = num5.intValue();
                                                                                if (this.e.contains(num5)) {
                                                                                    tkcVar.b().n().b(num5, str8);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it10 = ((List) map8.get(num5)).iterator();
                                                                                zG2 = true;
                                                                                while (true) {
                                                                                    if (it10.hasNext()) {
                                                                                        lfcVar = (lfc) it10.next();
                                                                                        if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                                                                            phc phcVarN3 = tkcVar.b().n();
                                                                                            if (lfcVar.x()) {
                                                                                                numValueOf5 = Integer.valueOf(lfcVar.y());
                                                                                            } else {
                                                                                                numValueOf5 = null;
                                                                                            }
                                                                                            phcVarN3.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                                                                            tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                                                                                        }
                                                                                        if (lfcVar.x()) {
                                                                                        }
                                                                                        phc phcVarL3 = tkcVar.b().l();
                                                                                        rhc rhcVarO3 = thc.o(this.d);
                                                                                        if (lfcVar.x()) {
                                                                                            numValueOf4 = Integer.valueOf(lfcVar.y());
                                                                                        } else {
                                                                                            numValueOf4 = null;
                                                                                        }
                                                                                        phcVarL3.c(rhcVarO3, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                        this.e.add(num5);
                                                                                        map8 = map8;
                                                                                        str8 = str8;
                                                                                    } else {
                                                                                        map8 = map8;
                                                                                        str8 = str8;
                                                                                    }
                                                                                    if (!zG2) {
                                                                                        this.e.add(num5);
                                                                                    }
                                                                                    map8 = map8;
                                                                                    str8 = str8;
                                                                                    l(num5).a(c0cVar);
                                                                                    map8 = map8;
                                                                                    str8 = str8;
                                                                                }
                                                                            }
                                                                            it8 = it9;
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    n30.c<Integer> cVar2 = (n30.c) this.f.keySet();
                                                                    cVar2.removeAll(this.e);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue6 = num6.intValue();
                                                                        t8d t8dVar3 = (t8d) this.f.get(num6);
                                                                        a78.g(t8dVar3);
                                                                        yic yicVarB2 = t8dVar3.b(iIntValue6);
                                                                        arrayList3.add(yicVarB2);
                                                                        p8cVarH1 = lzcVar2.h0();
                                                                        tkcVar3 = p8cVarH1.a;
                                                                        str11 = this.d;
                                                                        glc glcVarZ2 = yicVarB2.z();
                                                                        p8cVarH1.h();
                                                                        p8cVarH1.g();
                                                                        a78.d(str11);
                                                                        a78.g(glcVarZ2);
                                                                        byte[] bArrG2 = glcVarZ2.g();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str11);
                                                                        contentValues.put(str5, num6);
                                                                        contentValues.put("current_results", bArrG2);
                                                                        if (p8cVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            tkcVar3.b().k().b(thc.o(str11), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str15 = str3;
                                                                objO = obj2;
                                                                r22 = r22;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r18.b().k().c(thc.o(r22), e, "Database error querying filter results. appId");
                                                                Map map13 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map13;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r22 = r22;
                                                            r18 = r18;
                                                            str3 = str15;
                                                            obj2 = objO;
                                                            r22 = r22;
                                                            r18.b().k().c(thc.o(r22), e, "Database error querying filter results. appId");
                                                            Map map14 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map14;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                tkcVar = tkcVar5;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str111 = this.d;
                                                                    p8cVarH0 = lzcVar3.h0();
                                                                    str6 = this.d;
                                                                    p8cVarH0.h();
                                                                    p8cVarH0.g();
                                                                    a78.d(str6);
                                                                    n30Var3 = new n30();
                                                                    cursorRawQuery = p8cVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) n30Var3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                n30Var3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        n30Var3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = n30Var3;
                                                                    a78.d(str111);
                                                                    n30Var4 = new n30();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            glcVar3 = (glc) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r19 = r0;
                                                                            it3 = it2;
                                                                            tkcVar2 = tkcVar5;
                                                                            n30Var4.put(num, glcVar3);
                                                                            r0 = r19;
                                                                            str16 = str16;
                                                                            it2 = it3;
                                                                            tkcVar5 = tkcVar2;
                                                                        }
                                                                    }
                                                                    str4 = str16;
                                                                    tkcVar = tkcVar5;
                                                                    map3 = n30Var4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    tkcVar = tkcVar5;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map2;
                                                                map4 = map3;
                                                                while (r16.hasNext()) {
                                                                    num3.getClass();
                                                                    glcVar = (glc) map4.get(num3);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    n30Var = new n30();
                                                                    if (glcVar != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (pjcVar.x()) {
                                                                                glc glcVar9 = glcVar;
                                                                                Integer numValueOf12 = Integer.valueOf(pjcVar.y());
                                                                                if (pjcVar.z()) {
                                                                                    lValueOf = Long.valueOf(pjcVar.A());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                n30Var.put(numValueOf12, lValueOf);
                                                                                glcVar = glcVar9;
                                                                            }
                                                                        }
                                                                    }
                                                                    glcVar2 = glcVar;
                                                                    n30Var2 = new n30();
                                                                    if (glcVar2 != null) {
                                                                        it = glcVar2.D().iterator();
                                                                        while (it.hasNext()) {
                                                                            klcVar = (klc) it.next();
                                                                            if (!klcVar.x()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map15 = map4;
                                                                    if (glcVar2 != null) {
                                                                        i = 0;
                                                                        while (i < glcVar2.y() * 64) {
                                                                            if (qzc.L((h2c) glcVar2.x(), i)) {
                                                                                z4 = zR;
                                                                                tkcVar.b().n().c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (qzc.L((h2c) glcVar2.z(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zR = z4;
                                                                            } else {
                                                                                z4 = zR;
                                                                            }
                                                                            n30Var.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zR = z4;
                                                                        }
                                                                    }
                                                                    boolean z9 = zR;
                                                                    glc glcVar10 = (glc) map5.get(num3);
                                                                    if (zR2) {
                                                                        while (r2.hasNext()) {
                                                                            int iY4 = efcVar2.y();
                                                                            Integer num8 = num3;
                                                                            jLongValue = this.h.longValue() / 1000;
                                                                            if (efcVar2.G()) {
                                                                                jLongValue = this.g.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iY4);
                                                                            if (n30Var.containsKey(numValueOf)) {
                                                                                n30Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (n30Var2.containsKey(numValueOf)) {
                                                                                n30Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num3 = num8;
                                                                        }
                                                                    }
                                                                    String str112 = str3;
                                                                    this.f.put(num3, new t8d(this, this.d, glcVar10, bitSet, bitSet2, n30Var, n30Var2));
                                                                    map = map;
                                                                    zR = z9;
                                                                    str2 = str2;
                                                                    map5 = map5;
                                                                    str4 = str4;
                                                                    zR2 = zR2;
                                                                    str3 = str112;
                                                                    map4 = map15;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str24 = str3;
                                                            ?? r11 = obj2;
                                                            str8 = "Skipping failed audience ID";
                                                            if (!list.isEmpty()) {
                                                                u9dVar = new u9d(this);
                                                                n30Var5 = new n30();
                                                                it4 = list.iterator();
                                                                while (it4.hasNext()) {
                                                                    tjcVar = (tjc) it4.next();
                                                                    tjcVarA = u9dVar.a(this.d, tjcVar);
                                                                    if (tjcVarA != null) {
                                                                        r9cVarQ = lzcVar3.h0().Q(this.d, tjcVar, tjcVarA.C());
                                                                        lzcVar3.h0().H(str13, r9cVarQ);
                                                                        if (!z) {
                                                                            String str25 = str13;
                                                                            lzcVar = lzcVar3;
                                                                            j = r9cVarQ.c;
                                                                            strC = tjcVarA.C();
                                                                            map6 = (Map) n30Var5.get(strC);
                                                                            if (map6 == null) {
                                                                                p8c p8cVarH9 = lzcVar.h0();
                                                                                tkc tkcVar9 = p8cVarH9.a;
                                                                                str9 = this.d;
                                                                                p8cVarH9.h();
                                                                                p8cVarH9.g();
                                                                                a78.d(str9);
                                                                                a78.d(strC);
                                                                                n30Var7 = new n30();
                                                                                str10 = str9;
                                                                                cursorQuery2 = p8cVarH9.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strC}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    r9cVar = r9cVarQ;
                                                                                    while (true) {
                                                                                        efc efcVar8 = (efc) ((cfc) qzc.R(efc.J(), cursorQuery2.getBlob(1))).j();
                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) n30Var7.get(numValueOf3);
                                                                                        if (list5 == null) {
                                                                                            cursor2 = cursorQuery2;
                                                                                            arrayList2 = new ArrayList();
                                                                                            n30Var7.put(numValueOf3, arrayList2);
                                                                                        } else {
                                                                                            cursor2 = cursorQuery2;
                                                                                            arrayList2 = list5;
                                                                                        }
                                                                                        arrayList2.add(efcVar8);
                                                                                        if (!cursor2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        cursorQuery2 = cursor2;
                                                                                    }
                                                                                    cursor2.close();
                                                                                    map6 = n30Var7;
                                                                                } else {
                                                                                    cursor2 = cursorQuery2;
                                                                                    r9cVar = r9cVarQ;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursor2.close();
                                                                                }
                                                                                n30Var5.put(strC, map6);
                                                                            } else {
                                                                                r9cVar = r9cVarQ;
                                                                            }
                                                                            it5 = map6.keySet().iterator();
                                                                            while (it5.hasNext()) {
                                                                                num2 = (Integer) it5.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.e.contains(num2)) {
                                                                                    tkcVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it6 = ((List) map6.get(num2)).iterator();
                                                                                    z5 = true;
                                                                                    while (true) {
                                                                                        if (!it6.hasNext()) {
                                                                                            map7 = map6;
                                                                                            it7 = it5;
                                                                                            n30Var6 = n30Var5;
                                                                                            j2 = j;
                                                                                            break;
                                                                                        }
                                                                                        map7 = map6;
                                                                                        efc efcVar9 = (efc) it6.next();
                                                                                        it7 = it5;
                                                                                        n30Var6 = n30Var5;
                                                                                        aybVar = new ayb(this, this.d, iIntValue, efcVar9);
                                                                                        Long l9 = this.g;
                                                                                        Long l10 = this.h;
                                                                                        iY = efcVar9.y();
                                                                                        t8dVar = (t8d) this.f.get(num2);
                                                                                        if (t8dVar == null) {
                                                                                            z6 = false;
                                                                                        } else {
                                                                                            z6 = t8dVar.d.get(iY);
                                                                                        }
                                                                                        j2 = j;
                                                                                        zG = aybVar.g(l9, l10, tjcVarA, j2, r9cVar, z6);
                                                                                        if (!zG) {
                                                                                            this.e.add(num2);
                                                                                            z5 = zG;
                                                                                            break;
                                                                                        }
                                                                                        l(num2).a(aybVar);
                                                                                        z5 = zG;
                                                                                        j = j2;
                                                                                        map6 = map7;
                                                                                        it5 = it7;
                                                                                        n30Var5 = n30Var6;
                                                                                    }
                                                                                    if (!z5) {
                                                                                        this.e.add(num2);
                                                                                    }
                                                                                    j = j2;
                                                                                    map6 = map7;
                                                                                    it5 = it7;
                                                                                    n30Var5 = n30Var6;
                                                                                }
                                                                            }
                                                                            it4 = it4;
                                                                            str13 = str25;
                                                                            lzcVar3 = lzcVar;
                                                                            u9dVar = u9dVar;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            lzcVar2 = lzcVar3;
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                n30Var8 = new n30();
                                                                it8 = list2.iterator();
                                                                while (it8.hasNext()) {
                                                                    bmc bmcVar3 = (bmc) it8.next();
                                                                    strZ = bmcVar3.z();
                                                                    map8 = (Map) n30Var8.get(strZ);
                                                                    if (map8 == null) {
                                                                        p8c p8cVarH10 = lzcVar2.h0();
                                                                        tkcVar4 = p8cVarH10.a;
                                                                        str12 = this.d;
                                                                        p8cVarH10.h();
                                                                        p8cVarH10.g();
                                                                        a78.d(str12);
                                                                        a78.d(strZ);
                                                                        n30Var9 = new n30();
                                                                        cursorQuery3 = p8cVarH10.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strZ}, null, null, null);
                                                                        if (cursorQuery3.moveToFirst()) {
                                                                            while (true) {
                                                                                lfc lfcVar4 = (lfc) ((kfc) qzc.R(lfc.F(), cursorQuery3.getBlob(1))).j();
                                                                                numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                list6 = (List) n30Var9.get(numValueOf6);
                                                                                if (list6 == null) {
                                                                                    it9 = it8;
                                                                                    arrayList4 = new ArrayList();
                                                                                    n30Var9.put(numValueOf6, arrayList4);
                                                                                } else {
                                                                                    it9 = it8;
                                                                                    arrayList4 = list6;
                                                                                }
                                                                                arrayList4.add(lfcVar4);
                                                                                if (!cursorQuery3.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it8 = it9;
                                                                                tkcVar4 = tkcVar4;
                                                                            }
                                                                            cursorQuery3.close();
                                                                            map8 = n30Var9;
                                                                        } else {
                                                                            it9 = it8;
                                                                            map8 = Collections.EMPTY_MAP;
                                                                            cursorQuery3.close();
                                                                        }
                                                                        n30Var8.put(strZ, map8);
                                                                    } else {
                                                                        it9 = it8;
                                                                    }
                                                                    while (r4.hasNext()) {
                                                                        int iIntValue7 = num5.intValue();
                                                                        if (this.e.contains(num5)) {
                                                                            tkcVar.b().n().b(num5, str8);
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it10 = ((List) map8.get(num5)).iterator();
                                                                        zG2 = true;
                                                                        while (true) {
                                                                            if (it10.hasNext()) {
                                                                                lfcVar = (lfc) it10.next();
                                                                                if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                                                                    phc phcVarN4 = tkcVar.b().n();
                                                                                    if (lfcVar.x()) {
                                                                                        numValueOf5 = Integer.valueOf(lfcVar.y());
                                                                                    } else {
                                                                                        numValueOf5 = null;
                                                                                    }
                                                                                    phcVarN4.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                                                                    tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                                                                                }
                                                                                if (lfcVar.x()) {
                                                                                }
                                                                                phc phcVarL4 = tkcVar.b().l();
                                                                                rhc rhcVarO4 = thc.o(this.d);
                                                                                if (lfcVar.x()) {
                                                                                    numValueOf4 = Integer.valueOf(lfcVar.y());
                                                                                } else {
                                                                                    numValueOf4 = null;
                                                                                }
                                                                                phcVarL4.c(rhcVarO4, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                this.e.add(num5);
                                                                                map8 = map8;
                                                                                str8 = str8;
                                                                            } else {
                                                                                map8 = map8;
                                                                                str8 = str8;
                                                                            }
                                                                            if (!zG2) {
                                                                                this.e.add(num5);
                                                                            }
                                                                            map8 = map8;
                                                                            str8 = str8;
                                                                            l(num5).a(c0cVar);
                                                                            map8 = map8;
                                                                            str8 = str8;
                                                                        }
                                                                    }
                                                                    it8 = it9;
                                                                }
                                                            }
                                                            arrayList3 = new ArrayList();
                                                            n30.c<Integer> cVar3 = (n30.c) this.f.keySet();
                                                            cVar3.removeAll(this.e);
                                                            while (r3.hasNext()) {
                                                                int iIntValue8 = num6.intValue();
                                                                t8d t8dVar4 = (t8d) this.f.get(num6);
                                                                a78.g(t8dVar4);
                                                                yic yicVarB3 = t8dVar4.b(iIntValue8);
                                                                arrayList3.add(yicVarB3);
                                                                p8cVarH1 = lzcVar2.h0();
                                                                tkcVar3 = p8cVarH1.a;
                                                                str11 = this.d;
                                                                glc glcVarZ3 = yicVarB3.z();
                                                                p8cVarH1.h();
                                                                p8cVarH1.g();
                                                                a78.d(str11);
                                                                a78.g(glcVarZ3);
                                                                byte[] bArrG3 = glcVarZ3.g();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str11);
                                                                contentValues.put(str5, num6);
                                                                contentValues.put("current_results", bArrG3);
                                                                if (p8cVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    tkcVar3.b().k().b(thc.o(str11), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList3;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = n30Var10;
                                                } else {
                                                    Map map16 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map16;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    tkcVar = tkcVar5;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str113 = this.d;
                                                        p8cVarH0 = lzcVar3.h0();
                                                        str6 = this.d;
                                                        p8cVarH0.h();
                                                        p8cVarH0.g();
                                                        a78.d(str6);
                                                        n30Var3 = new n30();
                                                        cursorRawQuery = p8cVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) n30Var3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    n30Var3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            n30Var3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = n30Var3;
                                                        a78.d(str113);
                                                        n30Var4 = new n30();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                glcVar3 = (glc) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r19 = r0;
                                                                it3 = it2;
                                                                tkcVar2 = tkcVar5;
                                                                n30Var4.put(num, glcVar3);
                                                                r0 = r19;
                                                                str16 = str16;
                                                                it2 = it3;
                                                                tkcVar5 = tkcVar2;
                                                            }
                                                        }
                                                        str4 = str16;
                                                        tkcVar = tkcVar5;
                                                        map3 = n30Var4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        tkcVar = tkcVar5;
                                                        map3 = map2;
                                                    }
                                                    map5 = map2;
                                                    map4 = map3;
                                                    while (r16.hasNext()) {
                                                        num3.getClass();
                                                        glcVar = (glc) map4.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        n30Var = new n30();
                                                        if (glcVar != null) {
                                                            while (r3.hasNext()) {
                                                                if (pjcVar.x()) {
                                                                    glc glcVar11 = glcVar;
                                                                    Integer numValueOf13 = Integer.valueOf(pjcVar.y());
                                                                    if (pjcVar.z()) {
                                                                        lValueOf = Long.valueOf(pjcVar.A());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    n30Var.put(numValueOf13, lValueOf);
                                                                    glcVar = glcVar11;
                                                                }
                                                            }
                                                        }
                                                        glcVar2 = glcVar;
                                                        n30Var2 = new n30();
                                                        if (glcVar2 != null) {
                                                            it = glcVar2.D().iterator();
                                                            while (it.hasNext()) {
                                                                klcVar = (klc) it.next();
                                                                if (!klcVar.x()) {
                                                                }
                                                            }
                                                        }
                                                        Map map17 = map4;
                                                        if (glcVar2 != null) {
                                                            i = 0;
                                                            while (i < glcVar2.y() * 64) {
                                                                if (qzc.L((h2c) glcVar2.x(), i)) {
                                                                    z4 = zR;
                                                                    tkcVar.b().n().c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (qzc.L((h2c) glcVar2.z(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zR = z4;
                                                                } else {
                                                                    z4 = zR;
                                                                }
                                                                n30Var.remove(Integer.valueOf(i));
                                                                i++;
                                                                zR = z4;
                                                            }
                                                        }
                                                        boolean z10 = zR;
                                                        glc glcVar12 = (glc) map5.get(num3);
                                                        if (zR2) {
                                                            while (r2.hasNext()) {
                                                                int iY5 = efcVar2.y();
                                                                Integer num9 = num3;
                                                                jLongValue = this.h.longValue() / 1000;
                                                                if (efcVar2.G()) {
                                                                    jLongValue = this.g.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iY5);
                                                                if (n30Var.containsKey(numValueOf)) {
                                                                    n30Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (n30Var2.containsKey(numValueOf)) {
                                                                    n30Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num3 = num9;
                                                            }
                                                        }
                                                        String str114 = str3;
                                                        this.f.put(num3, new t8d(this, this.d, glcVar12, bitSet, bitSet2, n30Var, n30Var2));
                                                        map = map;
                                                        zR = z10;
                                                        str2 = str2;
                                                        map5 = map5;
                                                        str4 = str4;
                                                        zR2 = zR2;
                                                        str3 = str114;
                                                        map4 = map17;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str26 = str3;
                                                ?? r12 = obj2;
                                                str8 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    u9dVar = new u9d(this);
                                                    n30Var5 = new n30();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        tjcVar = (tjc) it4.next();
                                                        tjcVarA = u9dVar.a(this.d, tjcVar);
                                                        if (tjcVarA != null) {
                                                            r9cVarQ = lzcVar3.h0().Q(this.d, tjcVar, tjcVarA.C());
                                                            lzcVar3.h0().H(str13, r9cVarQ);
                                                            if (!z) {
                                                                String str27 = str13;
                                                                lzcVar = lzcVar3;
                                                                j = r9cVarQ.c;
                                                                strC = tjcVarA.C();
                                                                map6 = (Map) n30Var5.get(strC);
                                                                if (map6 == null) {
                                                                    p8c p8cVarH11 = lzcVar.h0();
                                                                    tkc tkcVar10 = p8cVarH11.a;
                                                                    str9 = this.d;
                                                                    p8cVarH11.h();
                                                                    p8cVarH11.g();
                                                                    a78.d(str9);
                                                                    a78.d(strC);
                                                                    n30Var7 = new n30();
                                                                    str10 = str9;
                                                                    cursorQuery2 = p8cVarH11.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strC}, null, null, null);
                                                                    if (cursorQuery2.moveToFirst()) {
                                                                        r9cVar = r9cVarQ;
                                                                        while (true) {
                                                                            efc efcVar10 = (efc) ((cfc) qzc.R(efc.J(), cursorQuery2.getBlob(1))).j();
                                                                            numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                            list5 = (List) n30Var7.get(numValueOf3);
                                                                            if (list5 == null) {
                                                                                cursor2 = cursorQuery2;
                                                                                arrayList2 = new ArrayList();
                                                                                n30Var7.put(numValueOf3, arrayList2);
                                                                            } else {
                                                                                cursor2 = cursorQuery2;
                                                                                arrayList2 = list5;
                                                                            }
                                                                            arrayList2.add(efcVar10);
                                                                            if (!cursor2.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery2 = cursor2;
                                                                        }
                                                                        cursor2.close();
                                                                        map6 = n30Var7;
                                                                    } else {
                                                                        cursor2 = cursorQuery2;
                                                                        r9cVar = r9cVarQ;
                                                                        map6 = Collections.EMPTY_MAP;
                                                                        cursor2.close();
                                                                    }
                                                                    n30Var5.put(strC, map6);
                                                                } else {
                                                                    r9cVar = r9cVarQ;
                                                                }
                                                                it5 = map6.keySet().iterator();
                                                                while (it5.hasNext()) {
                                                                    num2 = (Integer) it5.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.e.contains(num2)) {
                                                                        tkcVar.b().n().b(num2, "Skipping failed audience ID");
                                                                    } else {
                                                                        it6 = ((List) map6.get(num2)).iterator();
                                                                        z5 = true;
                                                                        while (true) {
                                                                            if (!it6.hasNext()) {
                                                                                map7 = map6;
                                                                                it7 = it5;
                                                                                n30Var6 = n30Var5;
                                                                                j2 = j;
                                                                                break;
                                                                            }
                                                                            map7 = map6;
                                                                            efc efcVar11 = (efc) it6.next();
                                                                            it7 = it5;
                                                                            n30Var6 = n30Var5;
                                                                            aybVar = new ayb(this, this.d, iIntValue, efcVar11);
                                                                            Long l11 = this.g;
                                                                            Long l12 = this.h;
                                                                            iY = efcVar11.y();
                                                                            t8dVar = (t8d) this.f.get(num2);
                                                                            if (t8dVar == null) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = t8dVar.d.get(iY);
                                                                            }
                                                                            j2 = j;
                                                                            zG = aybVar.g(l11, l12, tjcVarA, j2, r9cVar, z6);
                                                                            if (!zG) {
                                                                                this.e.add(num2);
                                                                                z5 = zG;
                                                                                break;
                                                                            }
                                                                            l(num2).a(aybVar);
                                                                            z5 = zG;
                                                                            j = j2;
                                                                            map6 = map7;
                                                                            it5 = it7;
                                                                            n30Var5 = n30Var6;
                                                                        }
                                                                        if (!z5) {
                                                                            this.e.add(num2);
                                                                        }
                                                                        j = j2;
                                                                        map6 = map7;
                                                                        it5 = it7;
                                                                        n30Var5 = n30Var6;
                                                                    }
                                                                }
                                                                it4 = it4;
                                                                str13 = str27;
                                                                lzcVar3 = lzcVar;
                                                                u9dVar = u9dVar;
                                                            }
                                                        }
                                                    }
                                                }
                                                lzcVar2 = lzcVar3;
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    n30Var8 = new n30();
                                                    it8 = list2.iterator();
                                                    while (it8.hasNext()) {
                                                        bmc bmcVar4 = (bmc) it8.next();
                                                        strZ = bmcVar4.z();
                                                        map8 = (Map) n30Var8.get(strZ);
                                                        if (map8 == null) {
                                                            p8c p8cVarH12 = lzcVar2.h0();
                                                            tkcVar4 = p8cVarH12.a;
                                                            str12 = this.d;
                                                            p8cVarH12.h();
                                                            p8cVarH12.g();
                                                            a78.d(str12);
                                                            a78.d(strZ);
                                                            n30Var9 = new n30();
                                                            cursorQuery3 = p8cVarH12.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strZ}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    lfc lfcVar5 = (lfc) ((kfc) qzc.R(lfc.F(), cursorQuery3.getBlob(1))).j();
                                                                    numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list6 = (List) n30Var9.get(numValueOf6);
                                                                    if (list6 == null) {
                                                                        it9 = it8;
                                                                        arrayList4 = new ArrayList();
                                                                        n30Var9.put(numValueOf6, arrayList4);
                                                                    } else {
                                                                        it9 = it8;
                                                                        arrayList4 = list6;
                                                                    }
                                                                    arrayList4.add(lfcVar5);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it8 = it9;
                                                                    tkcVar4 = tkcVar4;
                                                                }
                                                                cursorQuery3.close();
                                                                map8 = n30Var9;
                                                            } else {
                                                                it9 = it8;
                                                                map8 = Collections.EMPTY_MAP;
                                                                cursorQuery3.close();
                                                            }
                                                            n30Var8.put(strZ, map8);
                                                        } else {
                                                            it9 = it8;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue9 = num5.intValue();
                                                            if (this.e.contains(num5)) {
                                                                tkcVar.b().n().b(num5, str8);
                                                                break;
                                                                break;
                                                            }
                                                            it10 = ((List) map8.get(num5)).iterator();
                                                            zG2 = true;
                                                            while (true) {
                                                                if (it10.hasNext()) {
                                                                    lfcVar = (lfc) it10.next();
                                                                    if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                                                        phc phcVarN5 = tkcVar.b().n();
                                                                        if (lfcVar.x()) {
                                                                            numValueOf5 = Integer.valueOf(lfcVar.y());
                                                                        } else {
                                                                            numValueOf5 = null;
                                                                        }
                                                                        phcVarN5.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                                                        tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                                                                    }
                                                                    if (lfcVar.x()) {
                                                                    }
                                                                    phc phcVarL5 = tkcVar.b().l();
                                                                    rhc rhcVarO5 = thc.o(this.d);
                                                                    if (lfcVar.x()) {
                                                                        numValueOf4 = Integer.valueOf(lfcVar.y());
                                                                    } else {
                                                                        numValueOf4 = null;
                                                                    }
                                                                    phcVarL5.c(rhcVarO5, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                    this.e.add(num5);
                                                                    map8 = map8;
                                                                    str8 = str8;
                                                                } else {
                                                                    map8 = map8;
                                                                    str8 = str8;
                                                                }
                                                                if (!zG2) {
                                                                    this.e.add(num5);
                                                                }
                                                                map8 = map8;
                                                                str8 = str8;
                                                                l(num5).a(c0cVar);
                                                                map8 = map8;
                                                                str8 = str8;
                                                            }
                                                        }
                                                        it8 = it9;
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                n30.c<Integer> cVar4 = (n30.c) this.f.keySet();
                                                cVar4.removeAll(this.e);
                                                while (r3.hasNext()) {
                                                    int iIntValue10 = num6.intValue();
                                                    t8d t8dVar5 = (t8d) this.f.get(num6);
                                                    a78.g(t8dVar5);
                                                    yic yicVarB4 = t8dVar5.b(iIntValue10);
                                                    arrayList3.add(yicVarB4);
                                                    p8cVarH1 = lzcVar2.h0();
                                                    tkcVar3 = p8cVarH1.a;
                                                    str11 = this.d;
                                                    glc glcVarZ4 = yicVarB4.z();
                                                    p8cVarH1.h();
                                                    p8cVarH1.g();
                                                    a78.d(str11);
                                                    a78.g(glcVarZ4);
                                                    byte[] bArrG4 = glcVarZ4.g();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str11);
                                                    contentValues.put(str5, num6);
                                                    contentValues.put("current_results", bArrG4);
                                                    if (p8cVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        tkcVar3.b().k().b(thc.o(str11), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        r112.close();
                                        map = n30Var11;
                                    } else {
                                        str2 = "data";
                                        Query.close();
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    r110 = Query;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r8 = 0;
                        } catch (Throwable th12) {
                            th = th12;
                            r8 = 0;
                        }
                        p8c p8cVarH13 = lzcVar3.h0();
                        obj = p8cVarH13.a;
                        r5 = this.d;
                        p8cVarH13.h();
                        p8cVarH13.g();
                        a78.d(r5);
                        cursorQuery = p8cVarH13.X().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map18 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map18;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            n30Var10 = new n30();
                            r18 = obj;
                            r22 = r5;
                            while (true) {
                                i2 = cursorQuery.getInt(0);
                                glc glcVar13 = (glc) ((elc) qzc.R(glc.F(), cursorQuery.getBlob(1))).j();
                                Integer numValueOf14 = Integer.valueOf(i2);
                                n30Var10.put(numValueOf14, glcVar13);
                                str3 = str15;
                                obj2 = objO;
                                obj3 = numValueOf14;
                                r6 = r22;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str15 = str3;
                                objO = obj2;
                                r22 = r22;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = n30Var10;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            tkcVar = tkcVar5;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str115 = this.d;
                                p8cVarH0 = lzcVar3.h0();
                                str6 = this.d;
                                p8cVarH0.h();
                                p8cVarH0.g();
                                a78.d(str6);
                                n30Var3 = new n30();
                                cursorRawQuery = p8cVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) n30Var3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            n30Var3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    n30Var3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = n30Var3;
                                a78.d(str115);
                                n30Var4 = new n30();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        glcVar3 = (glc) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r19 = r0;
                                            it3 = it2;
                                            tkcVar2 = tkcVar5;
                                            n30Var4.put(num, glcVar3);
                                            r0 = r19;
                                            str16 = str16;
                                            it2 = it3;
                                            tkcVar5 = tkcVar2;
                                        } else {
                                            ?? r113 = r0;
                                            it3 = it2;
                                            List listN = lzcVar3.k0().N((h2c) glcVar3.z(), list4);
                                            if (listN.isEmpty()) {
                                                r0 = r113;
                                                it2 = it3;
                                            } else {
                                                elc elcVar = (elc) glcVar3.p();
                                                elcVar.o();
                                                elcVar.h();
                                                ((glc) elcVar.u).J(listN);
                                                List listN2 = lzcVar3.k0().N((h2c) glcVar3.x(), list4);
                                                elcVar.n();
                                                elcVar.h();
                                                ((glc) elcVar.u).H(listN2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it12 = glcVar3.B().iterator();
                                                while (it12.hasNext()) {
                                                    Iterator it13 = it12;
                                                    pjc pjcVar2 = (pjc) it12.next();
                                                    tkc tkcVar11 = tkcVar5;
                                                    if (!list4.contains(Integer.valueOf(pjcVar2.y()))) {
                                                        arrayList6.add(pjcVar2);
                                                    }
                                                    it12 = it13;
                                                    tkcVar5 = tkcVar11;
                                                }
                                                tkcVar2 = tkcVar5;
                                                elcVar.p();
                                                elcVar.h();
                                                ((glc) elcVar.u).L(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (klc klcVar2 : glcVar3.D()) {
                                                    if (!list4.contains(Integer.valueOf(klcVar2.y()))) {
                                                        arrayList7.add(klcVar2);
                                                    }
                                                }
                                                elcVar.q();
                                                elcVar.h();
                                                ((glc) elcVar.u).N(arrayList7);
                                                n30Var4.put(num, (glc) elcVar.j());
                                                r19 = r113;
                                                r0 = r19;
                                                str16 = str16;
                                                it2 = it3;
                                                tkcVar5 = tkcVar2;
                                            }
                                        }
                                    }
                                }
                                str4 = str16;
                                tkcVar = tkcVar5;
                                map3 = n30Var4;
                            } else {
                                str4 = "audience_id";
                                tkcVar = tkcVar5;
                                map3 = map2;
                            }
                            map5 = map2;
                            map4 = map3;
                            while (r16.hasNext()) {
                                num3.getClass();
                                glcVar = (glc) map4.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                n30Var = new n30();
                                if (glcVar != null && glcVar.C() != 0) {
                                    while (r3.hasNext()) {
                                        if (pjcVar.x()) {
                                            glc glcVar14 = glcVar;
                                            Integer numValueOf15 = Integer.valueOf(pjcVar.y());
                                            if (pjcVar.z()) {
                                                lValueOf = Long.valueOf(pjcVar.A());
                                            } else {
                                                lValueOf = null;
                                            }
                                            n30Var.put(numValueOf15, lValueOf);
                                            glcVar = glcVar14;
                                        }
                                    }
                                }
                                glcVar2 = glcVar;
                                n30Var2 = new n30();
                                if (glcVar2 != null && glcVar2.E() != 0) {
                                    it = glcVar2.D().iterator();
                                    while (it.hasNext()) {
                                        klcVar = (klc) it.next();
                                        if (!klcVar.x() && klcVar.A() > 0) {
                                            n30Var2.put(Integer.valueOf(klcVar.y()), Long.valueOf(klcVar.B(klcVar.A() - 1)));
                                            it = it;
                                            map4 = map4;
                                        }
                                    }
                                }
                                Map map19 = map4;
                                if (glcVar2 != null) {
                                    i = 0;
                                    while (i < glcVar2.y() * 64) {
                                        if (qzc.L((h2c) glcVar2.x(), i)) {
                                            z4 = zR;
                                            tkcVar.b().n().c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i);
                                            if (qzc.L((h2c) glcVar2.z(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zR = z4;
                                        } else {
                                            z4 = zR;
                                        }
                                        n30Var.remove(Integer.valueOf(i));
                                        i++;
                                        zR = z4;
                                    }
                                }
                                boolean z11 = zR;
                                glc glcVar15 = (glc) map5.get(num3);
                                if (zR2 && z11 && (list3 = (List) map.get(num3)) != null && this.h != null && this.g != null) {
                                    while (r2.hasNext()) {
                                        int iY6 = efcVar2.y();
                                        Integer num10 = num3;
                                        jLongValue = this.h.longValue() / 1000;
                                        if (efcVar2.G()) {
                                            jLongValue = this.g.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iY6);
                                        if (n30Var.containsKey(numValueOf)) {
                                            n30Var.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (n30Var2.containsKey(numValueOf)) {
                                            n30Var2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num3 = num10;
                                    }
                                }
                                String str116 = str3;
                                this.f.put(num3, new t8d(this, this.d, glcVar15, bitSet, bitSet2, n30Var, n30Var2));
                                map = map;
                                zR = z11;
                                str2 = str2;
                                map5 = map5;
                                str4 = str4;
                                zR2 = zR2;
                                str3 = str116;
                                map4 = map19;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str28 = str3;
                        ?? r13 = obj2;
                        str8 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            u9dVar = new u9d(this);
                            n30Var5 = new n30();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                tjcVar = (tjc) it4.next();
                                tjcVarA = u9dVar.a(this.d, tjcVar);
                                if (tjcVarA != null) {
                                    r9cVarQ = lzcVar3.h0().Q(this.d, tjcVar, tjcVarA.C());
                                    lzcVar3.h0().H(str13, r9cVarQ);
                                    if (!z) {
                                        String str29 = str13;
                                        lzcVar = lzcVar3;
                                        j = r9cVarQ.c;
                                        strC = tjcVarA.C();
                                        map6 = (Map) n30Var5.get(strC);
                                        if (map6 == null) {
                                            p8c p8cVarH14 = lzcVar.h0();
                                            tkc tkcVar12 = p8cVarH14.a;
                                            str9 = this.d;
                                            p8cVarH14.h();
                                            p8cVarH14.g();
                                            a78.d(str9);
                                            a78.d(strC);
                                            n30Var7 = new n30();
                                            str10 = str9;
                                            cursorQuery2 = p8cVarH14.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strC}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                r9cVar = r9cVarQ;
                                                while (true) {
                                                    efc efcVar12 = (efc) ((cfc) qzc.R(efc.J(), cursorQuery2.getBlob(1))).j();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) n30Var7.get(numValueOf3);
                                                    if (list5 == null) {
                                                        cursor2 = cursorQuery2;
                                                        arrayList2 = new ArrayList();
                                                        n30Var7.put(numValueOf3, arrayList2);
                                                    } else {
                                                        cursor2 = cursorQuery2;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(efcVar12);
                                                    if (!cursor2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery2 = cursor2;
                                                }
                                                cursor2.close();
                                                map6 = n30Var7;
                                            } else {
                                                cursor2 = cursorQuery2;
                                                r9cVar = r9cVarQ;
                                                map6 = Collections.EMPTY_MAP;
                                                cursor2.close();
                                            }
                                            n30Var5.put(strC, map6);
                                        } else {
                                            r9cVar = r9cVarQ;
                                        }
                                        it5 = map6.keySet().iterator();
                                        while (it5.hasNext()) {
                                            num2 = (Integer) it5.next();
                                            iIntValue = num2.intValue();
                                            if (this.e.contains(num2)) {
                                                tkcVar.b().n().b(num2, "Skipping failed audience ID");
                                            } else {
                                                it6 = ((List) map6.get(num2)).iterator();
                                                z5 = true;
                                                while (true) {
                                                    if (!it6.hasNext()) {
                                                        map7 = map6;
                                                        it7 = it5;
                                                        n30Var6 = n30Var5;
                                                        j2 = j;
                                                        break;
                                                    }
                                                    map7 = map6;
                                                    efc efcVar13 = (efc) it6.next();
                                                    it7 = it5;
                                                    n30Var6 = n30Var5;
                                                    aybVar = new ayb(this, this.d, iIntValue, efcVar13);
                                                    Long l13 = this.g;
                                                    Long l14 = this.h;
                                                    iY = efcVar13.y();
                                                    t8dVar = (t8d) this.f.get(num2);
                                                    if (t8dVar == null) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = t8dVar.d.get(iY);
                                                    }
                                                    j2 = j;
                                                    zG = aybVar.g(l13, l14, tjcVarA, j2, r9cVar, z6);
                                                    if (!zG) {
                                                        this.e.add(num2);
                                                        z5 = zG;
                                                        break;
                                                    }
                                                    l(num2).a(aybVar);
                                                    z5 = zG;
                                                    j = j2;
                                                    map6 = map7;
                                                    it5 = it7;
                                                    n30Var5 = n30Var6;
                                                }
                                                if (!z5) {
                                                    this.e.add(num2);
                                                }
                                                j = j2;
                                                map6 = map7;
                                                it5 = it7;
                                                n30Var5 = n30Var6;
                                            }
                                        }
                                        it4 = it4;
                                        str13 = str29;
                                        lzcVar3 = lzcVar;
                                        u9dVar = u9dVar;
                                    }
                                }
                            }
                        }
                        lzcVar2 = lzcVar3;
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            n30Var8 = new n30();
                            it8 = list2.iterator();
                            while (it8.hasNext()) {
                                bmc bmcVar5 = (bmc) it8.next();
                                strZ = bmcVar5.z();
                                map8 = (Map) n30Var8.get(strZ);
                                if (map8 == null) {
                                    p8c p8cVarH15 = lzcVar2.h0();
                                    tkcVar4 = p8cVarH15.a;
                                    str12 = this.d;
                                    p8cVarH15.h();
                                    p8cVarH15.g();
                                    a78.d(str12);
                                    a78.d(strZ);
                                    n30Var9 = new n30();
                                    cursorQuery3 = p8cVarH15.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strZ}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        while (true) {
                                            lfc lfcVar6 = (lfc) ((kfc) qzc.R(lfc.F(), cursorQuery3.getBlob(1))).j();
                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                            list6 = (List) n30Var9.get(numValueOf6);
                                            if (list6 == null) {
                                                it9 = it8;
                                                arrayList4 = new ArrayList();
                                                n30Var9.put(numValueOf6, arrayList4);
                                            } else {
                                                it9 = it8;
                                                arrayList4 = list6;
                                            }
                                            arrayList4.add(lfcVar6);
                                            if (!cursorQuery3.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it8 = it9;
                                            tkcVar4 = tkcVar4;
                                        }
                                        cursorQuery3.close();
                                        map8 = n30Var9;
                                    } else {
                                        it9 = it8;
                                        map8 = Collections.EMPTY_MAP;
                                        cursorQuery3.close();
                                    }
                                    n30Var8.put(strZ, map8);
                                } else {
                                    it9 = it8;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue11 = num5.intValue();
                                    if (this.e.contains(num5)) {
                                        tkcVar.b().n().b(num5, str8);
                                        break;
                                        break;
                                    }
                                    it10 = ((List) map8.get(num5)).iterator();
                                    zG2 = true;
                                    while (true) {
                                        if (it10.hasNext()) {
                                            lfcVar = (lfc) it10.next();
                                            if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                                phc phcVarN6 = tkcVar.b().n();
                                                if (lfcVar.x()) {
                                                    numValueOf5 = Integer.valueOf(lfcVar.y());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                phcVarN6.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                                tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                                            }
                                            if (lfcVar.x() || lfcVar.y() > 256) {
                                                phc phcVarL6 = tkcVar.b().l();
                                                rhc rhcVarO6 = thc.o(this.d);
                                                if (lfcVar.x()) {
                                                    numValueOf4 = Integer.valueOf(lfcVar.y());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                phcVarL6.c(rhcVarO6, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                this.e.add(num5);
                                                map8 = map8;
                                                str8 = str8;
                                            } else {
                                                c0cVar = new c0c(this, this.d, iIntValue11, lfcVar);
                                                Long l15 = this.g;
                                                Long l16 = this.h;
                                                int iY7 = lfcVar.y();
                                                t8d t8dVar6 = (t8d) this.f.get(num5);
                                                zG2 = c0cVar.g(l15, l16, bmcVar5, t8dVar6 == null ? false : t8dVar6.d.get(iY7));
                                                if (zG2) {
                                                    l(num5).a(c0cVar);
                                                    map8 = map8;
                                                    str8 = str8;
                                                } else {
                                                    this.e.add(num5);
                                                }
                                            }
                                        } else {
                                            map8 = map8;
                                            str8 = str8;
                                        }
                                        if (!zG2) {
                                            this.e.add(num5);
                                        }
                                        map8 = map8;
                                        str8 = str8;
                                    }
                                }
                                it8 = it9;
                            }
                        }
                        arrayList3 = new ArrayList();
                        n30.c<Integer> cVar5 = (n30.c) this.f.keySet();
                        cVar5.removeAll(this.e);
                        while (r3.hasNext()) {
                            int iIntValue12 = num6.intValue();
                            t8d t8dVar7 = (t8d) this.f.get(num6);
                            a78.g(t8dVar7);
                            yic yicVarB5 = t8dVar7.b(iIntValue12);
                            arrayList3.add(yicVarB5);
                            p8cVarH1 = lzcVar2.h0();
                            tkcVar3 = p8cVarH1.a;
                            str11 = this.d;
                            glc glcVarZ5 = yicVarB5.z();
                            p8cVarH1.h();
                            p8cVarH1.g();
                            a78.d(str11);
                            a78.g(glcVarZ5);
                            byte[] bArrG5 = glcVarZ5.g();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str11);
                            contentValues.put(str5, num6);
                            contentValues.put("current_results", bArrG5);
                            if (p8cVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                tkcVar3.b().k().b(thc.o(str11), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList3;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map110 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map110;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        n30Var10 = new n30();
                        r18 = obj;
                        r22 = r5;
                        while (true) {
                            i2 = cursorQuery.getInt(0);
                            glc glcVar16 = (glc) ((elc) qzc.R(glc.F(), cursorQuery.getBlob(1))).j();
                            Integer numValueOf16 = Integer.valueOf(i2);
                            n30Var10.put(numValueOf16, glcVar16);
                            str3 = str15;
                            obj2 = objO;
                            obj3 = numValueOf16;
                            r6 = r22;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str15 = str3;
                            objO = obj2;
                            r22 = r22;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = n30Var10;
                    }
                } catch (SQLiteException e26) {
                    e = e26;
                    r18 = obj;
                    r22 = r5;
                }
            } catch (Throwable th13) {
                th = th13;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = p8cVarH13.X().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r18 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r22 = r5;
            cursorQuery = null;
        } catch (Throwable th14) {
            th = th14;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map9;
        p8c p8cVarH16 = lzcVar3.h0();
        obj = p8cVarH16.a;
        r5 = this.d;
        p8cVarH16.h();
        p8cVarH16.g();
        a78.d(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            tkcVar = tkcVar5;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str117 = this.d;
                p8cVarH0 = lzcVar3.h0();
                str6 = this.d;
                p8cVarH0.h();
                p8cVarH0.g();
                a78.d(str6);
                n30Var3 = new n30();
                cursorRawQuery = p8cVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) n30Var3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            n30Var3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    n30Var3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = n30Var3;
                a78.d(str117);
                n30Var4 = new n30();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        glcVar3 = (glc) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r19 = r0;
                        it3 = it2;
                        tkcVar2 = tkcVar5;
                        n30Var4.put(num, glcVar3);
                        r0 = r19;
                        str16 = str16;
                        it2 = it3;
                        tkcVar5 = tkcVar2;
                    }
                }
                str4 = str16;
                tkcVar = tkcVar5;
                map3 = n30Var4;
            } else {
                str4 = "audience_id";
                tkcVar = tkcVar5;
                map3 = map2;
            }
            map5 = map2;
            map4 = map3;
            while (r16.hasNext()) {
                num3.getClass();
                glcVar = (glc) map4.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                n30Var = new n30();
                if (glcVar != null) {
                    while (r3.hasNext()) {
                        if (pjcVar.x()) {
                            glc glcVar17 = glcVar;
                            Integer numValueOf17 = Integer.valueOf(pjcVar.y());
                            if (pjcVar.z()) {
                                lValueOf = Long.valueOf(pjcVar.A());
                            } else {
                                lValueOf = null;
                            }
                            n30Var.put(numValueOf17, lValueOf);
                            glcVar = glcVar17;
                        }
                    }
                }
                glcVar2 = glcVar;
                n30Var2 = new n30();
                if (glcVar2 != null) {
                    it = glcVar2.D().iterator();
                    while (it.hasNext()) {
                        klcVar = (klc) it.next();
                        if (!klcVar.x()) {
                        }
                    }
                }
                Map map111 = map4;
                if (glcVar2 != null) {
                    i = 0;
                    while (i < glcVar2.y() * 64) {
                        if (qzc.L((h2c) glcVar2.x(), i)) {
                            z4 = zR;
                            tkcVar.b().n().c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (qzc.L((h2c) glcVar2.z(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zR = z4;
                        } else {
                            z4 = zR;
                        }
                        n30Var.remove(Integer.valueOf(i));
                        i++;
                        zR = z4;
                    }
                }
                boolean z12 = zR;
                glc glcVar18 = (glc) map5.get(num3);
                if (zR2) {
                    while (r2.hasNext()) {
                        int iY8 = efcVar2.y();
                        Integer num11 = num3;
                        jLongValue = this.h.longValue() / 1000;
                        if (efcVar2.G()) {
                            jLongValue = this.g.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iY8);
                        if (n30Var.containsKey(numValueOf)) {
                            n30Var.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (n30Var2.containsKey(numValueOf)) {
                            n30Var2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num3 = num11;
                    }
                }
                String str118 = str3;
                this.f.put(num3, new t8d(this, this.d, glcVar18, bitSet, bitSet2, n30Var, n30Var2));
                map = map;
                zR = z12;
                str2 = str2;
                map5 = map5;
                str4 = str4;
                zR2 = zR2;
                str3 = str118;
                map4 = map111;
            }
            str5 = str4;
        }
        str7 = str2;
        String str210 = str3;
        ?? r14 = obj2;
        str8 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            u9dVar = new u9d(this);
            n30Var5 = new n30();
            it4 = list.iterator();
            while (it4.hasNext()) {
                tjcVar = (tjc) it4.next();
                tjcVarA = u9dVar.a(this.d, tjcVar);
                if (tjcVarA != null) {
                    r9cVarQ = lzcVar3.h0().Q(this.d, tjcVar, tjcVarA.C());
                    lzcVar3.h0().H(str13, r9cVarQ);
                    if (!z) {
                        String str211 = str13;
                        lzcVar = lzcVar3;
                        j = r9cVarQ.c;
                        strC = tjcVarA.C();
                        map6 = (Map) n30Var5.get(strC);
                        if (map6 == null) {
                            p8c p8cVarH17 = lzcVar.h0();
                            tkc tkcVar13 = p8cVarH17.a;
                            str9 = this.d;
                            p8cVarH17.h();
                            p8cVarH17.g();
                            a78.d(str9);
                            a78.d(strC);
                            n30Var7 = new n30();
                            str10 = str9;
                            cursorQuery2 = p8cVarH17.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strC}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                r9cVar = r9cVarQ;
                                while (true) {
                                    efc efcVar14 = (efc) ((cfc) qzc.R(efc.J(), cursorQuery2.getBlob(1))).j();
                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                    list5 = (List) n30Var7.get(numValueOf3);
                                    if (list5 == null) {
                                        cursor2 = cursorQuery2;
                                        arrayList2 = new ArrayList();
                                        n30Var7.put(numValueOf3, arrayList2);
                                    } else {
                                        cursor2 = cursorQuery2;
                                        arrayList2 = list5;
                                    }
                                    arrayList2.add(efcVar14);
                                    if (!cursor2.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery2 = cursor2;
                                }
                                cursor2.close();
                                map6 = n30Var7;
                            } else {
                                cursor2 = cursorQuery2;
                                r9cVar = r9cVarQ;
                                map6 = Collections.EMPTY_MAP;
                                cursor2.close();
                            }
                            n30Var5.put(strC, map6);
                        } else {
                            r9cVar = r9cVarQ;
                        }
                        it5 = map6.keySet().iterator();
                        while (it5.hasNext()) {
                            num2 = (Integer) it5.next();
                            iIntValue = num2.intValue();
                            if (this.e.contains(num2)) {
                                tkcVar.b().n().b(num2, "Skipping failed audience ID");
                            } else {
                                it6 = ((List) map6.get(num2)).iterator();
                                z5 = true;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        map7 = map6;
                                        it7 = it5;
                                        n30Var6 = n30Var5;
                                        j2 = j;
                                        break;
                                    }
                                    map7 = map6;
                                    efc efcVar15 = (efc) it6.next();
                                    it7 = it5;
                                    n30Var6 = n30Var5;
                                    aybVar = new ayb(this, this.d, iIntValue, efcVar15);
                                    Long l17 = this.g;
                                    Long l18 = this.h;
                                    iY = efcVar15.y();
                                    t8dVar = (t8d) this.f.get(num2);
                                    if (t8dVar == null) {
                                        z6 = false;
                                    } else {
                                        z6 = t8dVar.d.get(iY);
                                    }
                                    j2 = j;
                                    zG = aybVar.g(l17, l18, tjcVarA, j2, r9cVar, z6);
                                    if (!zG) {
                                        this.e.add(num2);
                                        z5 = zG;
                                        break;
                                    }
                                    l(num2).a(aybVar);
                                    z5 = zG;
                                    j = j2;
                                    map6 = map7;
                                    it5 = it7;
                                    n30Var5 = n30Var6;
                                }
                                if (!z5) {
                                    this.e.add(num2);
                                }
                                j = j2;
                                map6 = map7;
                                it5 = it7;
                                n30Var5 = n30Var6;
                            }
                        }
                        it4 = it4;
                        str13 = str211;
                        lzcVar3 = lzcVar;
                        u9dVar = u9dVar;
                    }
                }
            }
        }
        lzcVar2 = lzcVar3;
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            n30Var8 = new n30();
            it8 = list2.iterator();
            while (it8.hasNext()) {
                bmc bmcVar6 = (bmc) it8.next();
                strZ = bmcVar6.z();
                map8 = (Map) n30Var8.get(strZ);
                if (map8 == null) {
                    p8c p8cVarH18 = lzcVar2.h0();
                    tkcVar4 = p8cVarH18.a;
                    str12 = this.d;
                    p8cVarH18.h();
                    p8cVarH18.g();
                    a78.d(str12);
                    a78.d(strZ);
                    n30Var9 = new n30();
                    cursorQuery3 = p8cVarH18.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strZ}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            lfc lfcVar7 = (lfc) ((kfc) qzc.R(lfc.F(), cursorQuery3.getBlob(1))).j();
                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) n30Var9.get(numValueOf6);
                            if (list6 == null) {
                                it9 = it8;
                                arrayList4 = new ArrayList();
                                n30Var9.put(numValueOf6, arrayList4);
                            } else {
                                it9 = it8;
                                arrayList4 = list6;
                            }
                            arrayList4.add(lfcVar7);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it8 = it9;
                            tkcVar4 = tkcVar4;
                        }
                        cursorQuery3.close();
                        map8 = n30Var9;
                    } else {
                        it9 = it8;
                        map8 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                    }
                    n30Var8.put(strZ, map8);
                } else {
                    it9 = it8;
                }
                while (r4.hasNext()) {
                    int iIntValue13 = num5.intValue();
                    if (this.e.contains(num5)) {
                        tkcVar.b().n().b(num5, str8);
                        break;
                        break;
                    }
                    it10 = ((List) map8.get(num5)).iterator();
                    zG2 = true;
                    while (true) {
                        if (it10.hasNext()) {
                            lfcVar = (lfc) it10.next();
                            if (Log.isLoggable(tkcVar.b().q(), 2)) {
                                phc phcVarN7 = tkcVar.b().n();
                                if (lfcVar.x()) {
                                    numValueOf5 = Integer.valueOf(lfcVar.y());
                                } else {
                                    numValueOf5 = null;
                                }
                                phcVarN7.d("Evaluating filter. audience, filter, property", num5, numValueOf5, tkcVar.n().c(lfcVar.z()));
                                tkcVar.b().n().b(lzcVar2.k0().I(lfcVar), "Filter definition");
                            }
                            if (lfcVar.x()) {
                            }
                            phc phcVarL7 = tkcVar.b().l();
                            rhc rhcVarO7 = thc.o(this.d);
                            if (lfcVar.x()) {
                                numValueOf4 = Integer.valueOf(lfcVar.y());
                            } else {
                                numValueOf4 = null;
                            }
                            phcVarL7.c(rhcVarO7, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                            this.e.add(num5);
                            map8 = map8;
                            str8 = str8;
                        } else {
                            map8 = map8;
                            str8 = str8;
                        }
                        if (!zG2) {
                            this.e.add(num5);
                        }
                        map8 = map8;
                        str8 = str8;
                        l(num5).a(c0cVar);
                        map8 = map8;
                        str8 = str8;
                    }
                }
                it8 = it9;
            }
        }
        arrayList3 = new ArrayList();
        n30.c<Integer> cVar6 = (n30.c) this.f.keySet();
        cVar6.removeAll(this.e);
        while (r3.hasNext()) {
            int iIntValue14 = num6.intValue();
            t8d t8dVar8 = (t8d) this.f.get(num6);
            a78.g(t8dVar8);
            yic yicVarB6 = t8dVar8.b(iIntValue14);
            arrayList3.add(yicVarB6);
            p8cVarH1 = lzcVar2.h0();
            tkcVar3 = p8cVarH1.a;
            str11 = this.d;
            glc glcVarZ6 = yicVarB6.z();
            p8cVarH1.h();
            p8cVarH1.g();
            a78.d(str11);
            a78.g(glcVarZ6);
            byte[] bArrG6 = glcVarZ6.g();
            contentValues = new ContentValues();
            contentValues.put("app_id", str11);
            contentValues.put(str5, num6);
            contentValues.put("current_results", bArrG6);
            if (p8cVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                tkcVar3.b().k().b(thc.o(str11), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t8d l(Integer num) {
        if (this.f.containsKey(num)) {
            return (t8d) this.f.get(num);
        }
        t8d t8dVar = new t8d(this, this.d);
        this.f.put(num, t8dVar);
        return t8dVar;
    }

    @Override // defpackage.fyc
    public final void j() {
    }
}
