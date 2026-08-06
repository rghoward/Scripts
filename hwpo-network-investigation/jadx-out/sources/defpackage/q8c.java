package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q8c {
    public final HashMap a = new HashMap();
    public final cac b = new cac();

    public q8c() {
        m8c m8cVar = new m8c();
        eac eacVar = eac.BITWISE_AND;
        ArrayList arrayList = m8cVar.a;
        arrayList.add(eacVar);
        arrayList.add(eac.BITWISE_LEFT_SHIFT);
        arrayList.add(eac.BITWISE_NOT);
        arrayList.add(eac.BITWISE_OR);
        arrayList.add(eac.BITWISE_RIGHT_SHIFT);
        arrayList.add(eac.BITWISE_UNSIGNED_RIGHT_SHIFT);
        arrayList.add(eac.BITWISE_XOR);
        a(m8cVar);
        s8c s8cVar = new s8c();
        eac eacVar2 = eac.EQUALS;
        ArrayList arrayList2 = s8cVar.a;
        arrayList2.add(eacVar2);
        arrayList2.add(eac.GREATER_THAN);
        arrayList2.add(eac.GREATER_THAN_EQUALS);
        arrayList2.add(eac.IDENTITY_EQUALS);
        arrayList2.add(eac.IDENTITY_NOT_EQUALS);
        arrayList2.add(eac.LESS_THAN);
        arrayList2.add(eac.LESS_THAN_EQUALS);
        arrayList2.add(eac.NOT_EQUALS);
        a(s8cVar);
        u8c u8cVar = new u8c();
        eac eacVar3 = eac.APPLY;
        ArrayList arrayList3 = u8cVar.a;
        arrayList3.add(eacVar3);
        arrayList3.add(eac.BLOCK);
        arrayList3.add(eac.BREAK);
        arrayList3.add(eac.CASE);
        arrayList3.add(eac.DEFAULT);
        arrayList3.add(eac.CONTINUE);
        arrayList3.add(eac.DEFINE_FUNCTION);
        arrayList3.add(eac.FN);
        arrayList3.add(eac.IF);
        arrayList3.add(eac.QUOTE);
        arrayList3.add(eac.RETURN);
        arrayList3.add(eac.SWITCH);
        arrayList3.add(eac.TERNARY);
        a(u8cVar);
        o9c o9cVar = new o9c();
        eac eacVar4 = eac.AND;
        ArrayList arrayList4 = o9cVar.a;
        arrayList4.add(eacVar4);
        arrayList4.add(eac.NOT);
        arrayList4.add(eac.OR);
        a(o9cVar);
        y9c y9cVar = new y9c();
        eac eacVar5 = eac.FOR_IN;
        ArrayList arrayList5 = y9cVar.a;
        arrayList5.add(eacVar5);
        arrayList5.add(eac.FOR_IN_CONST);
        arrayList5.add(eac.FOR_IN_LET);
        arrayList5.add(eac.FOR_LET);
        arrayList5.add(eac.FOR_OF);
        arrayList5.add(eac.FOR_OF_CONST);
        arrayList5.add(eac.FOR_OF_LET);
        arrayList5.add(eac.WHILE);
        a(y9cVar);
        aac aacVar = new aac();
        eac eacVar6 = eac.ADD;
        ArrayList arrayList6 = aacVar.a;
        arrayList6.add(eacVar6);
        arrayList6.add(eac.DIVIDE);
        arrayList6.add(eac.MODULUS);
        arrayList6.add(eac.MULTIPLY);
        arrayList6.add(eac.NEGATE);
        arrayList6.add(eac.POST_DECREMENT);
        arrayList6.add(eac.POST_INCREMENT);
        arrayList6.add(eac.PRE_DECREMENT);
        arrayList6.add(eac.PRE_INCREMENT);
        arrayList6.add(eac.SUBTRACT);
        a(aacVar);
        dac dacVar = new dac();
        eac eacVar7 = eac.ASSIGN;
        ArrayList arrayList7 = dacVar.a;
        arrayList7.add(eacVar7);
        arrayList7.add(eac.CONST);
        arrayList7.add(eac.CREATE_ARRAY);
        arrayList7.add(eac.CREATE_OBJECT);
        arrayList7.add(eac.EXPRESSION_LIST);
        arrayList7.add(eac.GET);
        arrayList7.add(eac.GET_INDEX);
        arrayList7.add(eac.GET_PROPERTY);
        arrayList7.add(eac.NULL);
        arrayList7.add(eac.SET_PROPERTY);
        arrayList7.add(eac.TYPEOF);
        arrayList7.add(eac.UNDEFINED);
        arrayList7.add(eac.VAR);
        a(dacVar);
    }

    public final void a(o8c o8cVar) {
        ArrayList arrayList = o8cVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.a.put(Integer.valueOf(((eac) obj).t).toString(), o8cVar);
        }
    }

    public final a8c b(cgc cgcVar, a8c a8cVar) {
        gic.k(cgcVar);
        if (!(a8cVar instanceof c8c)) {
            return a8cVar;
        }
        c8c c8cVar = (c8c) a8cVar;
        ArrayList arrayList = c8cVar.u;
        String str = c8cVar.t;
        HashMap map = this.a;
        return (map.containsKey(str) ? (o8c) map.get(str) : this.b).a(str, cgcVar, arrayList);
    }
}
