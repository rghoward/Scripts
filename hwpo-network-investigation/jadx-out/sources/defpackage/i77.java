package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i77 {
    /* JADX WARN: Code duplicated, block: B:223:0x043d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0642  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v24, types: [c67, h67] */
    public static final void a(final o67 o67Var, final h67 h67Var, final ox6 ox6Var, final di diVar, final oh4 oh4Var, final oh4 oh4Var2, final oh4 oh4Var3, final oh4 oh4Var4, jt1 jt1Var, final int i) {
        bj4 bj4Var;
        r87 r87Var;
        m76 m76Var;
        Object z67Var;
        final js1 js1Var;
        final h37 h37Var;
        ?? r14;
        a03 a03Var;
        bj4 bj4Var2;
        a03 a03Var2;
        boolean z;
        final r27 r27Var;
        bj4 bj4Var3;
        js1 js1Var2;
        int[] intArray;
        int[] iArr;
        ArrayList arrayList;
        String strA;
        c67 c67VarA;
        h67 h67Var2;
        Bundle bundle;
        c67 c67VarA2;
        h67 h67Var3;
        bj4 bj4Var4;
        bj4 bj4VarO = jt1Var.o(-1964664536);
        int i2 = (i & 6) == 0 ? (bj4VarO.j(o67Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(h67Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(diVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= bj4VarO.j(oh4Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= bj4VarO.j(oh4Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bj4VarO.j(null) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((38347923 & i3) == 38347922 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var4 = bj4VarO;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            m76 m76Var2 = (m76) bj4VarO.F(kc6.a);
            whb whbVarA = xc6.a(bj4VarO);
            if (whbVarA == null) {
                aa0.c("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            vhb viewModelStore = whbVarA.getViewModelStore();
            o67Var.getClass();
            q57 q57Var = o67Var.b;
            viewModelStore.getClass();
            q57Var.getClass();
            r87 r87Var2 = q57Var.s;
            if (!xj5.a(q57Var.o, r57.a.a(viewModelStore))) {
                if (!q57Var.f.isEmpty()) {
                    aa0.c("ViewModelStore should be set before setGraph call");
                    return;
                }
                q57Var.o = r57.a.a(viewModelStore);
            }
            h67Var.getClass();
            q57Var.getClass();
            LinkedHashMap linkedHashMap = q57Var.t;
            l67 l67Var = h67Var.y;
            h30<r47> h30Var = q57Var.f;
            if (!h30Var.isEmpty() && q57Var.i() == s66.b.t) {
                aa0.c("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            if (xj5.a(q57Var.c, h67Var)) {
                bj4Var = bj4VarO;
                r87Var = r87Var2;
                i3 = i3;
                m76Var = m76Var2;
                int iF = l67Var.b.f();
                for (int i4 = 0; i4 < iF; i4++) {
                    c67 c67VarG = l67Var.b.g(i4);
                    h67 h67Var4 = q57Var.c;
                    h67Var4.getClass();
                    int iD = h67Var4.y.b.d(i4);
                    h67 h67Var5 = q57Var.c;
                    h67Var5.getClass();
                    fx9<c67> fx9Var = h67Var5.y.b;
                    if (fx9Var.t) {
                        zb9.b(fx9Var);
                    }
                    int iD2 = ty1.d(fx9Var.w, iD, fx9Var.u);
                    if (iD2 >= 0) {
                        Object[] objArr = fx9Var.v;
                        Object obj = objArr[iD2];
                        objArr[iD2] = c67VarG;
                    }
                }
                for (r47 r47Var : h30Var) {
                    int i5 = c67.x;
                    xv8 xv8Var = new xv8(cd9.e(c67.a.b(r47Var.u)));
                    c67 c67VarA3 = q57Var.c;
                    c67VarA3.getClass();
                    Iterator it = xv8Var.iterator();
                    while (true) {
                        ListIterator listIterator = ((xv8.a) it).t;
                        if (listIterator.hasPrevious()) {
                            c67 c67Var = (c67) listIterator.previous();
                            if (!xj5.a(c67Var, q57Var.c) || !c67VarA3.equals(h67Var)) {
                                if (c67VarA3 instanceof h67) {
                                    c67VarA3 = ((h67) c67VarA3).y.a(c67Var.u.d);
                                    c67VarA3.getClass();
                                }
                            }
                        }
                    }
                    r47Var.u = c67VarA3;
                }
            } else {
                h67 h67Var6 = q57Var.c;
                if (h67Var6 != null) {
                    ArrayList arrayList2 = new ArrayList(q57Var.l.keySet());
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj2 = arrayList2.get(i6);
                        int i7 = i6 + 1;
                        Integer num = (Integer) obj2;
                        num.getClass();
                        ArrayList arrayList3 = arrayList2;
                        int iIntValue = num.intValue();
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((g57.a) it2.next()).d = true;
                            i7 = i7;
                            size = size;
                        }
                        int i8 = size;
                        int i9 = i7;
                        l77 l77Var = new l77();
                        l77Var.c = true;
                        g2b g2bVar = g2b.a;
                        boolean z2 = l77Var.b;
                        k77.a aVar = l77Var.a;
                        aVar.a = z2;
                        aVar.b = true;
                        String str = l77Var.e;
                        if (str != null) {
                            boolean z3 = l77Var.f;
                            boolean z4 = l77Var.g;
                            aVar.d = str;
                            aVar.c = -1;
                            aVar.e = z3;
                            aVar.f = z4;
                        } else {
                            aVar.b(l77Var.d, l77Var.f, l77Var.g);
                        }
                        boolean zR = q57Var.r(iIntValue, null, aVar.a());
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((g57.a) it3.next()).d = false;
                        }
                        if (zR) {
                            q57Var.n(iIntValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        i6 = i9;
                        size = i8;
                    }
                    q57Var.n(h67Var6.u.d, true, false);
                }
                q57Var.c = h67Var;
                r87 r87Var3 = q57Var.s;
                final g57 g57Var = q57Var.a;
                c57 c57Var = g57Var.c;
                Bundle bundle2 = q57Var.d;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        xx.e("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        String str2 = stringArrayList.get(i10);
                        i10++;
                        int i11 = size2;
                        String str3 = str2;
                        r87Var3.b(str3);
                        if (bundle2.containsKey(str3) && bundle2.getBundle(str3) == null) {
                            xx.e(str3);
                            throw null;
                        }
                        size2 = i11;
                    }
                }
                Bundle[] bundleArr = q57Var.e;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle3 = bundleArr2[i12];
                        bundle3.getClass();
                        int i13 = length;
                        bundle3.setClassLoader(z47.class.getClassLoader());
                        String string = bundle3.getString("nav-entry-state:id");
                        if (string == null) {
                            xx.e("nav-entry-state:id");
                            throw null;
                        }
                        int iB = wx.b(bundle3, "nav-entry-state:destination-id");
                        int i14 = i12;
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            xx.e("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            xx.e("nav-entry-state:saved-state");
                            throw null;
                        }
                        c67 c67VarD = q57Var.d(iB, null);
                        if (c67VarD == null) {
                            int i15 = c67.x;
                            ru3.e(aa.a("Restoring the Navigation back stack failed: destination ", c67.a.a(c57Var, iB), " cannot be found from the current destination "), q57Var.g());
                            return;
                        }
                        s66.b bVarI = q57Var.i();
                        r57 r57Var = q57Var.o;
                        c57Var.getClass();
                        bVarI.getClass();
                        Context context = c57Var.a;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        r47 r47Var2 = new r47(c57Var, c67VarD, bundle4, bVarI, r57Var, string, bundle5);
                        p87 p87VarB = r87Var3.b(c67VarD.t);
                        Object aVar2 = linkedHashMap.get(p87VarB);
                        if (aVar2 == null) {
                            aVar2 = new g57.a(g57Var, p87VarB);
                            linkedHashMap.put(p87VarB, aVar2);
                        }
                        h30Var.addLast(r47Var2);
                        ((g57.a) aVar2).g(r47Var2);
                        h67 h67Var7 = r47Var2.u.v;
                        if (h67Var7 != null) {
                            q57Var.k(r47Var2, q57Var.f(h67Var7.u.d));
                        }
                        i12 = i14 + 1;
                        bundleArr = bundleArr2;
                        length = i13;
                    }
                    q57Var.b.invoke();
                    q57Var.e = null;
                }
                Collection collectionValues = qi6.l(r87Var3.a).values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (!((p87) obj3).b) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj4 = arrayList4.get(i16);
                    i16++;
                    p87 p87Var = (p87) obj4;
                    Object aVar3 = linkedHashMap.get(p87Var);
                    if (aVar3 == null) {
                        p87Var.getClass();
                        aVar3 = new g57.a(g57Var, p87Var);
                        linkedHashMap.put(p87Var, aVar3);
                    }
                    p87Var.getClass();
                    p87Var.a = (g57.a) aVar3;
                    p87Var.b = true;
                }
                if (q57Var.c == null || !h30Var.isEmpty()) {
                    bj4Var = bj4VarO;
                    r87Var = r87Var2;
                    i3 = i3;
                    m76Var = m76Var2;
                    q57Var.b();
                } else {
                    Activity activity = g57Var.d;
                    if (g57Var.e || activity == null) {
                        bj4Var = bj4VarO;
                        r87Var = r87Var2;
                        i3 = i3;
                        m76Var = m76Var2;
                        h67 h67Var8 = q57Var.c;
                        h67Var8.getClass();
                        q57Var.l(h67Var8, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        q57 q57Var2 = g57Var.b;
                        if (intent == null) {
                            bj4Var = bj4VarO;
                            r87Var = r87Var2;
                            i3 = i3;
                            m76Var = m76Var2;
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e) {
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                bundleC.putAll(bundle6);
                            }
                            if (intArray == null || intArray.length == 0) {
                                ?? J = q57Var2.j();
                                m76Var = m76Var2;
                                bj4Var = bj4VarO;
                                c67.b bVarJ = J.j(new b67(intent.getAction(), intent.getType(), intent.getData()), J);
                                if (bVarJ != null) {
                                    c67 c67Var2 = bVarJ.t;
                                    int[] iArrE = c67Var2.e(null);
                                    Bundle bundleD = c67Var2.d(bVarJ.u);
                                    if (bundleD != null) {
                                        bundleC.putAll(bundleD);
                                    }
                                    iArr = iArrE;
                                    arrayList = null;
                                }
                                if (iArr != null || iArr.length == 0) {
                                    r87Var = r87Var2;
                                } else {
                                    q57Var2.getClass();
                                    h67 h67Var9 = q57Var2.c;
                                    int length2 = iArr.length;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= length2) {
                                            r87Var = r87Var2;
                                            strA = null;
                                            break;
                                        }
                                        int i18 = length2;
                                        int i19 = iArr[i17];
                                        if (i17 == 0) {
                                            r87Var = r87Var2;
                                            h67 h67Var10 = q57Var2.c;
                                            h67Var10.getClass();
                                            c67VarA2 = h67Var10.u.d == i19 ? q57Var2.c : null;
                                        } else {
                                            r87Var = r87Var2;
                                            h67Var9.getClass();
                                            c67VarA2 = h67Var9.y.a(i19);
                                        }
                                        if (c67VarA2 == null) {
                                            int i20 = c67.x;
                                            strA = c67.a.a(q57Var2.a.c, i19);
                                            break;
                                        }
                                        if (i17 != iArr.length - 1 && (c67VarA2 instanceof h67)) {
                                            while (true) {
                                                h67Var3 = (h67) c67VarA2;
                                                h67Var3.getClass();
                                                l67 l67Var2 = h67Var3.y;
                                                if (!(l67Var2.a(l67Var2.c) instanceof h67)) {
                                                    break;
                                                } else {
                                                    c67VarA2 = l67Var2.a(l67Var2.c);
                                                }
                                            }
                                            h67Var9 = h67Var3;
                                        }
                                        i17++;
                                        length2 = i18;
                                        r87Var2 = r87Var;
                                    }
                                    if (strA != null) {
                                        Log.i("NavController", "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length3 = iArr.length;
                                        Bundle[] bundleArr3 = new Bundle[length3];
                                        for (int i21 = 0; i21 < length3; i21++) {
                                            Bundle bundleC2 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                                            bundleC2.putAll(bundleC);
                                            if (arrayList != null && (bundle = (Bundle) arrayList.get(i21)) != null) {
                                                bundleC2.putAll(bundle);
                                            }
                                            bundleArr3[i21] = bundleC2;
                                        }
                                        int flags = intent.getFlags();
                                        int i22 = 268435456 & flags;
                                        if (i22 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            baa baaVar = new baa(g57Var.a);
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(baaVar.u.getPackageManager());
                                            }
                                            if (component != null) {
                                                baaVar.d(component);
                                            }
                                            baaVar.t.add(intent);
                                            baaVar.e();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i22 != 0) {
                                            if (!q57Var2.f.isEmpty()) {
                                                h67 h67Var11 = q57Var2.c;
                                                h67Var11.getClass();
                                                q57Var2.n(h67Var11.u.d, true, false);
                                            }
                                            int i23 = 0;
                                            while (i23 < iArr.length) {
                                                int i24 = iArr[i23];
                                                int i25 = i23 + 1;
                                                Bundle bundle7 = bundleArr3[i23];
                                                final c67 c67VarD2 = q57Var2.d(i24, null);
                                                if (c67VarD2 == null) {
                                                    int i26 = c67.x;
                                                    ru3.e(aa.a("Deep Linking failed: destination ", c67.a.a(c57Var, i24), " cannot be found from the current destination "), q57Var2.g());
                                                    return;
                                                }
                                                oh4 oh4Var5 = new oh4() { // from class: f57
                                                    @Override // defpackage.oh4
                                                    public final Object invoke(Object obj5) {
                                                        q57 q57Var3 = g57Var.b;
                                                        l77 l77Var2 = (l77) obj5;
                                                        l77Var2.getClass();
                                                        g2b g2bVar2 = g2b.a;
                                                        k77.a aVar4 = l77Var2.a;
                                                        aVar4.g = 0;
                                                        aVar4.h = 0;
                                                        c67 c67Var3 = c67VarD2;
                                                        if (c67Var3 instanceof h67) {
                                                            int i27 = c67.x;
                                                            for (c67 c67Var4 : c67.a.b(c67Var3)) {
                                                                c67 c67VarG2 = q57Var3.g();
                                                                if (xj5.a(c67Var4, c67VarG2 != null ? c67VarG2.v : null)) {
                                                                }
                                                            }
                                                            int i28 = h67.z;
                                                            l77Var2.a(h67.a.a(q57Var3.h()).u.d);
                                                            a68 a68Var = new a68();
                                                            a68Var.b = true;
                                                            g2b g2bVar3 = g2b.a;
                                                            l77Var2.f = a68Var.a;
                                                            l77Var2.g = true;
                                                        }
                                                        return g2b.a;
                                                    }
                                                };
                                                l77 l77Var2 = new l77();
                                                oh4Var5.invoke(l77Var2);
                                                boolean z5 = l77Var2.b;
                                                k77.a aVar4 = l77Var2.a;
                                                aVar4.a = z5;
                                                aVar4.b = l77Var2.c;
                                                String str4 = l77Var2.e;
                                                if (str4 != null) {
                                                    boolean z6 = l77Var2.f;
                                                    boolean z7 = l77Var2.g;
                                                    aVar4.d = str4;
                                                    aVar4.c = -1;
                                                    aVar4.e = z6;
                                                    aVar4.f = z7;
                                                } else {
                                                    aVar4.b(l77Var2.d, l77Var2.f, l77Var2.g);
                                                }
                                                q57Var2.l(c67VarD2, bundle7, aVar4.a());
                                                i23 = i25;
                                            }
                                            g57Var.e = true;
                                        } else {
                                            h67 h67Var12 = q57Var2.c;
                                            int length4 = iArr.length;
                                            for (int i27 = 0; i27 < length4; i27++) {
                                                int i28 = iArr[i27];
                                                Bundle bundle8 = bundleArr3[i27];
                                                if (i27 == 0) {
                                                    c67VarA = q57Var2.c;
                                                } else {
                                                    h67Var12.getClass();
                                                    c67VarA = h67Var12.y.a(i28);
                                                }
                                                if (c67VarA == null) {
                                                    int i29 = c67.x;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + c67.a.a(c57Var, i28) + " cannot be found in graph " + h67Var12);
                                                }
                                                if (i27 == iArr.length - 1) {
                                                    h67 h67Var13 = q57Var2.c;
                                                    h67Var13.getClass();
                                                    q57Var2.l(c67VarA, bundle8, new k77(false, false, h67Var13.u.d, true, false, 0, 0));
                                                } else if (c67VarA instanceof h67) {
                                                    while (true) {
                                                        h67Var2 = (h67) c67VarA;
                                                        h67Var2.getClass();
                                                        l67 l67Var3 = h67Var2.y;
                                                        if (!(l67Var3.a(l67Var3.c) instanceof h67)) {
                                                            break;
                                                        } else {
                                                            c67VarA = l67Var3.a(l67Var3.c);
                                                        }
                                                    }
                                                    h67Var12 = h67Var2;
                                                }
                                            }
                                            g57Var.e = true;
                                        }
                                    }
                                }
                            } else {
                                bj4Var = bj4VarO;
                                m76Var = m76Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr = intArray;
                            if (iArr != null) {
                                r87Var = r87Var2;
                            } else {
                                r87Var = r87Var2;
                            }
                        }
                        h67 h67Var14 = q57Var.c;
                        h67Var14.getClass();
                        q57Var.l(h67Var14, null, null);
                    }
                }
            }
            r87 r87Var4 = r87Var;
            p87 p87VarB2 = r87Var4.b("composable");
            js1 js1Var3 = p87VarB2 instanceof js1 ? (js1) p87VarB2 : null;
            if (js1Var3 == null) {
                xj8 xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w67
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            i77.a(o67Var, h67Var, ox6Var, diVar, oh4Var, oh4Var2, oh4Var3, oh4Var4, (jt1) obj5, gz3.s(i | 1));
                            return g2b.a;
                        }
                    };
                    return;
                }
                return;
            }
            bj4 bj4Var5 = bj4Var;
            h37 h37VarC = bl7.c(js1Var3.b().e, bj4Var5, 0);
            Object objF = bj4Var5.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new at7(0.0f);
                bj4Var5.C(objF);
            }
            b27 b27Var = (b27) objF;
            Object objF2 = bj4Var5.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(Boolean.FALSE);
                bj4Var5.C(objF2);
            }
            h37 h37Var2 = (h37) objF2;
            boolean z8 = ((List) h37VarC.getValue()).size() > 1;
            boolean zJ = bj4Var5.J(h37VarC) | bj4Var5.j(js1Var3);
            Object objF3 = bj4Var5.f();
            if (zJ || objF3 == c0187a) {
                js1Var = js1Var3;
                h37Var = h37Var2;
                z67Var = new z67(js1Var, h37VarC, b27Var, h37Var, null);
                bj4Var5.C(z67Var);
            } else {
                z67Var = objF3;
                js1Var = js1Var3;
                h37Var = h37Var2;
            }
            j84.b(z8, (ci4) z67Var, bj4Var5, 0);
            final m76 m76Var3 = m76Var;
            boolean zJ2 = bj4Var5.j(o67Var) | bj4Var5.j(m76Var3);
            Object objF4 = bj4Var5.f();
            if (zJ2 || objF4 == c0187a) {
                objF4 = new oh4() { // from class: x67
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj5) {
                        s66 lifecycle;
                        o67 o67Var2 = o67Var;
                        o67Var2.getClass();
                        m76 m76Var4 = m76Var3;
                        m76Var4.getClass();
                        q57 q57Var3 = o67Var2.b;
                        i57 i57Var = q57Var3.r;
                        if (!m76Var4.equals(q57Var3.n)) {
                            m76 m76Var5 = q57Var3.n;
                            if (m76Var5 != null && (lifecycle = m76Var5.getLifecycle()) != null) {
                                lifecycle.c(i57Var);
                            }
                            q57Var3.n = m76Var4;
                            m76Var4.getLifecycle().a(i57Var);
                        }
                        return new g77();
                    }
                };
                bj4Var5.C(objF4);
            }
            wd3.a(m76Var3, (oh4) objF4, bj4Var5);
            l09 l09VarB = kt7.b(bj4Var5);
            h37 h37VarC2 = bl7.c(q57Var.i, bj4Var5, 0);
            Object objF5 = bj4Var5.f();
            if (objF5 == c0187a) {
                objF5 = bl7.f(new to6(1, h37VarC2));
                bj4Var5.C(objF5);
            }
            final yz9 yz9Var = (yz9) objF5;
            r47 r47Var3 = (r47) th1.H((List) yz9Var.getValue());
            Object objF6 = bj4Var5.f();
            if (objF6 == c0187a) {
                int i30 = ie7.a;
                objF6 = new r27((Object) null);
                bj4Var5.C(objF6);
            }
            r27 r27Var2 = (r27) objF6;
            if (r47Var3 != null) {
                bj4Var5.K(-1797563167);
                boolean zJ3 = bj4Var5.j(js1Var) | ((((i3 & 3670016) ^ 1572864) > 1048576 && bj4Var5.J(oh4Var3)) || (i3 & 1572864) == 1048576) | ((i3 & 57344) == 16384);
                Object objF7 = bj4Var5.f();
                if (zJ3 || objF7 == c0187a) {
                    objF7 = new oh4() { // from class: y67
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj5) {
                            oh4<ru<r47>, th3> oh4Var6;
                            oh4<ru<r47>, th3> oh4Var7;
                            ru<r47> ruVar = (ru) obj5;
                            c67 c67Var3 = ruVar.f().u;
                            c67Var3.getClass();
                            js1.a aVar5 = (js1.a) c67Var3;
                            th3 th3Var = null;
                            if (((Boolean) js1Var.c.getValue()).booleanValue() || ((Boolean) h37Var.getValue()).booleanValue()) {
                                int i31 = c67.x;
                                for (c67 c67Var4 : c67.a.b(aVar5)) {
                                    th3 th3VarInvoke = (!(c67Var4 instanceof js1.a) || (oh4Var6 = ((js1.a) c67Var4).B) == null) ? null : oh4Var6.invoke(ruVar);
                                    if (th3VarInvoke != null) {
                                        th3Var = th3VarInvoke;
                                        break;
                                    }
                                }
                                return th3Var == null ? (th3) oh4Var3.invoke(ruVar) : th3Var;
                            }
                            int i32 = c67.x;
                            for (c67 c67Var5 : c67.a.b(aVar5)) {
                                th3 th3VarInvoke2 = (!(c67Var5 instanceof js1.a) || (oh4Var7 = ((js1.a) c67Var5).z) == null) ? null : oh4Var7.invoke(ruVar);
                                if (th3VarInvoke2 != null) {
                                    th3Var = th3VarInvoke2;
                                    break;
                                }
                            }
                            return th3Var == null ? (th3) oh4Var.invoke(ruVar) : th3Var;
                        }
                    };
                    bj4Var5.C(objF7);
                }
                final oh4 oh4Var6 = (oh4) objF7;
                boolean zJ4 = bj4Var5.j(js1Var) | ((((i3 & 29360128) ^ 12582912) > 8388608 && bj4Var5.J(oh4Var4)) || (i3 & 12582912) == 8388608) | ((i3 & 458752) == 131072);
                Object objF8 = bj4Var5.f();
                if (zJ4 || objF8 == c0187a) {
                    objF8 = new oh4() { // from class: q67
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj5) {
                            oh4<ru<r47>, jo3> oh4Var7;
                            oh4<ru<r47>, jo3> oh4Var8;
                            ru<r47> ruVar = (ru) obj5;
                            c67 c67Var3 = ruVar.d().u;
                            c67Var3.getClass();
                            js1.a aVar5 = (js1.a) c67Var3;
                            jo3 jo3Var = null;
                            if (((Boolean) js1Var.c.getValue()).booleanValue() || ((Boolean) h37Var.getValue()).booleanValue()) {
                                int i31 = c67.x;
                                for (c67 c67Var4 : c67.a.b(aVar5)) {
                                    jo3 jo3VarInvoke = (!(c67Var4 instanceof js1.a) || (oh4Var7 = ((js1.a) c67Var4).C) == null) ? null : oh4Var7.invoke(ruVar);
                                    if (jo3VarInvoke != null) {
                                        jo3Var = jo3VarInvoke;
                                        break;
                                    }
                                }
                                return jo3Var == null ? (jo3) oh4Var4.invoke(ruVar) : jo3Var;
                            }
                            int i32 = c67.x;
                            for (c67 c67Var5 : c67.a.b(aVar5)) {
                                jo3 jo3VarInvoke2 = (!(c67Var5 instanceof js1.a) || (oh4Var8 = ((js1.a) c67Var5).A) == null) ? null : oh4Var8.invoke(ruVar);
                                if (jo3VarInvoke2 != null) {
                                    jo3Var = jo3VarInvoke2;
                                    break;
                                }
                            }
                            return jo3Var == null ? (jo3) oh4Var2.invoke(ruVar) : jo3Var;
                        }
                    };
                    bj4Var5.C(objF8);
                }
                final oh4 oh4Var7 = (oh4) objF8;
                final h37 h37Var3 = h37Var;
                boolean z9 = (i3 & 234881024) == 67108864;
                Object objF9 = bj4Var5.f();
                if (z9 || objF9 == c0187a) {
                    objF9 = new tc(2);
                    bj4Var5.C(objF9);
                }
                final oh4 oh4Var8 = (oh4) objF9;
                Boolean bool = Boolean.TRUE;
                boolean zJ5 = bj4Var5.j(js1Var);
                Object objF10 = bj4Var5.f();
                if (zJ5 || objF10 == c0187a) {
                    objF10 = new r67(0, yz9Var, js1Var);
                    bj4Var5.C(objF10);
                }
                wd3.a(bool, (oh4) objF10, bj4Var5);
                Object objF11 = bj4Var5.f();
                if (objF11 == c0187a) {
                    objF11 = new w89(r47Var3);
                    bj4Var5.C(objF11);
                }
                w89 w89Var = (w89) objF11;
                bw bwVar = w89.s;
                tva tvaVarD = owa.d(w89Var, "entry", bj4Var5, 56);
                if (((Boolean) h37Var3.getValue()).booleanValue()) {
                    bj4Var5.K(-1795329152);
                    Float fValueOf = Float.valueOf(b27Var.h());
                    boolean zJ6 = bj4Var5.J(h37VarC) | bj4Var5.j(w89Var);
                    Object objF12 = bj4Var5.f();
                    if (zJ6 || objF12 == c0187a) {
                        objF12 = new a77(w89Var, h37VarC, b27Var, null);
                        bj4Var5.C(objF12);
                    }
                    wd3.d(bj4Var5, (ci4) objF12, fValueOf);
                    z = false;
                    bj4Var5.U(false);
                    a03Var2 = null;
                } else {
                    bj4Var5.K(-1794910745);
                    boolean zJ7 = bj4Var5.j(w89Var) | bj4Var5.j(r47Var3) | bj4Var5.J(tvaVarD);
                    Object objF13 = bj4Var5.f();
                    if (zJ7 || objF13 == c0187a) {
                        a03Var2 = null;
                        objF13 = new c77(w89Var, r47Var3, tvaVarD, null);
                        bj4Var5.C(objF13);
                    } else {
                        a03Var2 = null;
                    }
                    wd3.d(bj4Var5, (ci4) objF13, r47Var3);
                    z = false;
                    bj4Var5.U(false);
                }
                boolean zJ8 = bj4Var5.j(r27Var2) | bj4Var5.j(js1Var) | bj4Var5.J(oh4Var6) | bj4Var5.J(oh4Var7) | bj4Var5.J(oh4Var8);
                Object objF14 = bj4Var5.f();
                if (zJ8 || objF14 == c0187a) {
                    final js1 js1Var4 = js1Var;
                    r27Var = r27Var2;
                    bj4Var3 = bj4Var5;
                    oh4 oh4Var9 = new oh4() { // from class: s67
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj5) {
                            float f;
                            ru ruVar = (ru) obj5;
                            if (!((List) yz9Var.getValue()).contains(ruVar.d())) {
                                return lu.c(th3.a, jo3.a);
                            }
                            String str5 = ((r47) ruVar.d()).y;
                            r27 r27Var3 = r27Var;
                            int iB2 = r27Var3.b(str5);
                            if (iB2 >= 0) {
                                f = r27Var3.c[iB2];
                            } else {
                                r27Var3.d(str5, 0.0f);
                                f = 0.0f;
                            }
                            if (!xj5.a(((r47) ruVar.f()).y, ((r47) ruVar.d()).y)) {
                                f = (((Boolean) js1Var4.c.getValue()).booleanValue() || ((Boolean) h37Var3.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            r27Var3.d(((r47) ruVar.f()).y, f);
                            return new oz1((th3) oh4Var6.invoke(ruVar), (jo3) oh4Var7.invoke(ruVar), f, (mr9) oh4Var8.invoke(ruVar));
                        }
                    };
                    js1Var2 = js1Var4;
                    bj4Var3.C(oh4Var9);
                    objF14 = oh4Var9;
                } else {
                    js1Var2 = js1Var;
                    r27Var = r27Var2;
                    bj4Var3 = bj4Var5;
                }
                oh4 oh4Var10 = (oh4) objF14;
                Object objF15 = bj4Var3.f();
                if (objF15 == c0187a) {
                    objF15 = new ad(2);
                    bj4Var3.C(objF15);
                }
                bj4 bj4Var6 = bj4Var3;
                a03Var = a03Var2;
                boolean z10 = z;
                r27 r27Var3 = r27Var;
                lu.b(tvaVarD, ox6Var, oh4Var10, diVar, (oh4) objF15, gr1.b(820763100, new e77(w89Var, r47Var3, l09VarB, h37Var3, yz9Var), bj4Var3), bj4Var6, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                bj4 bj4Var7 = bj4Var6;
                Object objB = tvaVarD.a.b();
                Object value = tvaVarD.d.getValue();
                boolean zJ9 = bj4Var7.J(tvaVarD) | bj4Var7.j(o67Var) | bj4Var7.j(r47Var3) | bj4Var7.j(js1Var2) | bj4Var7.j(r27Var3);
                Object objF16 = bj4Var7.f();
                if (zJ9 || objF16 == c0187a) {
                    f77 f77Var = new f77(tvaVarD, o67Var, r47Var3, r27Var3, yz9Var, js1Var2, null);
                    bj4Var7.C(f77Var);
                    objF16 = f77Var;
                }
                wd3.f(objB, value, (ci4) objF16, bj4Var7);
                bj4Var7.U(z10);
                bj4Var2 = bj4Var7;
                r14 = z10;
            } else {
                bj4 bj4Var8 = bj4Var5;
                r14 = 0;
                a03Var = null;
                bj4Var8.K(-1789758886);
                bj4Var8.U(false);
                bj4Var2 = bj4Var8;
            }
            p87 p87VarB3 = r87Var4.b("dialog");
            a03 a03Var3 = p87VarB3 instanceof a03 ? (a03) p87VarB3 : a03Var;
            if (a03Var3 == null) {
                xj8 xj8VarW2 = bj4Var2.W();
                if (xj8VarW2 != null) {
                    xj8VarW2.d = new ci4() { // from class: u67
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            i77.a(o67Var, h67Var, ox6Var, diVar, oh4Var, oh4Var2, oh4Var3, oh4Var4, (jt1) obj5, gz3.s(i | 1));
                            return g2b.a;
                        }
                    };
                    return;
                }
                return;
            }
            xz2.a(a03Var3, bj4Var2, r14);
            bj4Var4 = bj4Var2;
        }
        xj8 xj8VarW3 = bj4Var4.W();
        if (xj8VarW3 != null) {
            xj8VarW3.d = new ci4() { // from class: v67
                @Override // defpackage.ci4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    i77.a(o67Var, h67Var, ox6Var, diVar, oh4Var, oh4Var2, oh4Var3, oh4Var4, (jt1) obj5, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void b(final o67 o67Var, final String str, ox6 ox6Var, di diVar, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, oh4 oh4Var4, final oh4 oh4Var5, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        int i5;
        char c;
        int i6;
        jt1.a.C0187a c0187a;
        ox6 ox6Var3;
        Object objF;
        Object objF2;
        oh4 oh4Var6;
        di diVar2;
        int i7;
        oh4 oh4Var7;
        ox6 ox6Var4;
        oh4 oh4Var8;
        oh4 oh4Var9;
        boolean z;
        boolean z2;
        boolean z3;
        Object objF3;
        final oh4 oh4Var10;
        final oh4 oh4Var11;
        final oh4 oh4Var12;
        final oh4 oh4Var13;
        final di diVar3;
        final ox6 ox6Var5;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(1840250294);
        int i8 = 4;
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(o67Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            i4 = 1797120 | i3;
            if ((12582912 & i) == 0) {
                i4 = 5991424 | i3;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            i5 = 805306368 | i4;
            if (bj4VarO.j(oh4Var5)) {
                c = 4;
            } else {
                c = 2;
            }
            if ((306783379 & i5) != 306783378 && (c & 3) == 2 && bj4VarO.r()) {
                bj4VarO.u();
                diVar3 = diVar;
                oh4Var13 = oh4Var;
                oh4Var11 = oh4Var3;
                ox6Var5 = ox6Var2;
                oh4Var12 = oh4Var2;
                oh4Var10 = oh4Var4;
            } else {
                bj4VarO.v0();
                i6 = i & 1;
                c0187a = jt1.a.a;
                if (i6 != 0 || bj4VarO.c0()) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw(2);
                        bj4VarO.C(objF);
                    }
                    oh4 oh4Var14 = (oh4) objF;
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yc(i8);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    diVar2 = di.a.a;
                    i7 = i5 & (-264241153);
                    oh4Var7 = oh4Var14;
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                } else {
                    bj4VarO.u();
                    diVar2 = diVar;
                    oh4Var9 = oh4Var;
                    i7 = i5 & (-264241153);
                    ox6Var4 = ox6Var2;
                    oh4Var6 = oh4Var2;
                    oh4Var7 = oh4Var3;
                    oh4Var8 = oh4Var4;
                }
                bj4VarO.V();
                if ((i7 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                oh4 oh4Var15 = oh4Var7;
                if ((i7 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z | ((c & 14) == 4);
                objF3 = bj4VarO.f();
                if (z3 || objF3 == c0187a) {
                    i67 i67Var = new i67(o67Var.b.s, str);
                    oh4Var5.invoke(i67Var);
                    objF3 = i67Var.c();
                    bj4VarO.C(objF3);
                }
                h67 h67Var = (h67) objF3;
                int i10 = i7 >> 3;
                int i11 = (i7 & 8078) | (i10 & 57344) | (458752 & i10) | (i10 & 234881024);
                di diVar4 = diVar2;
                oh4 oh4Var16 = oh4Var6;
                a(o67Var, h67Var, ox6Var4, diVar4, oh4Var9, oh4Var16, oh4Var15, oh4Var8, bj4VarO, i11);
                oh4Var10 = oh4Var8;
                oh4Var11 = oh4Var15;
                oh4Var12 = oh4Var16;
                oh4Var13 = oh4Var9;
                diVar3 = diVar4;
                ox6Var5 = ox6Var4;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: t67
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i77.b(o67Var, str, ox6Var5, diVar3, oh4Var13, oh4Var12, oh4Var11, oh4Var10, oh4Var5, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        i4 = 1797120 | i3;
        if ((12582912 & i) == 0) {
            i4 = 5991424 | i3;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        i5 = 805306368 | i4;
        if (bj4VarO.j(oh4Var5)) {
            c = 4;
        } else {
            c = 2;
        }
        if ((306783379 & i5) != 306783378) {
            bj4VarO.v0();
            i6 = i & 1;
            c0187a = jt1.a.a;
            if (i6 != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw(2);
                    bj4VarO.C(objF);
                }
                oh4 oh4Var17 = (oh4) objF;
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new yc(i8);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                diVar2 = di.a.a;
                i7 = i5 & (-264241153);
                oh4Var7 = oh4Var17;
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw(2);
                    bj4VarO.C(objF);
                }
                oh4 oh4Var18 = (oh4) objF;
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new yc(i8);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                diVar2 = di.a.a;
                i7 = i5 & (-264241153);
                oh4Var7 = oh4Var18;
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            }
            bj4VarO.V();
            if ((i7 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            oh4 oh4Var19 = oh4Var7;
            if ((i7 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z | ((c & 14) == 4);
            objF3 = bj4VarO.f();
            if (z3) {
                i67 i67Var2 = new i67(o67Var.b.s, str);
                oh4Var5.invoke(i67Var2);
                objF3 = i67Var2.c();
                bj4VarO.C(objF3);
            } else {
                i67 i67Var3 = new i67(o67Var.b.s, str);
                oh4Var5.invoke(i67Var3);
                objF3 = i67Var3.c();
                bj4VarO.C(objF3);
            }
            h67 h67Var2 = (h67) objF3;
            int i12 = i7 >> 3;
            int i13 = (i7 & 8078) | (i12 & 57344) | (458752 & i12) | (i12 & 234881024);
            di diVar5 = diVar2;
            oh4 oh4Var110 = oh4Var6;
            a(o67Var, h67Var2, ox6Var4, diVar5, oh4Var9, oh4Var110, oh4Var19, oh4Var8, bj4VarO, i13);
            oh4Var10 = oh4Var8;
            oh4Var11 = oh4Var19;
            oh4Var12 = oh4Var110;
            oh4Var13 = oh4Var9;
            diVar3 = diVar5;
            ox6Var5 = ox6Var4;
        } else {
            bj4VarO.v0();
            i6 = i & 1;
            c0187a = jt1.a.a;
            if (i6 != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw(2);
                    bj4VarO.C(objF);
                }
                oh4 oh4Var111 = (oh4) objF;
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new yc(i8);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                diVar2 = di.a.a;
                i7 = i5 & (-264241153);
                oh4Var7 = oh4Var111;
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw(2);
                    bj4VarO.C(objF);
                }
                oh4 oh4Var112 = (oh4) objF;
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new yc(i8);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                diVar2 = di.a.a;
                i7 = i5 & (-264241153);
                oh4Var7 = oh4Var112;
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            }
            bj4VarO.V();
            if ((i7 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            oh4 oh4Var113 = oh4Var7;
            if ((i7 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z | ((c & 14) == 4);
            objF3 = bj4VarO.f();
            if (z3) {
                i67 i67Var4 = new i67(o67Var.b.s, str);
                oh4Var5.invoke(i67Var4);
                objF3 = i67Var4.c();
                bj4VarO.C(objF3);
            } else {
                i67 i67Var5 = new i67(o67Var.b.s, str);
                oh4Var5.invoke(i67Var5);
                objF3 = i67Var5.c();
                bj4VarO.C(objF3);
            }
            h67 h67Var3 = (h67) objF3;
            int i14 = i7 >> 3;
            int i15 = (i7 & 8078) | (i14 & 57344) | (458752 & i14) | (i14 & 234881024);
            di diVar6 = diVar2;
            oh4 oh4Var114 = oh4Var6;
            a(o67Var, h67Var3, ox6Var4, diVar6, oh4Var9, oh4Var114, oh4Var113, oh4Var8, bj4VarO, i15);
            oh4Var10 = oh4Var8;
            oh4Var11 = oh4Var113;
            oh4Var12 = oh4Var114;
            oh4Var13 = oh4Var9;
            diVar3 = diVar6;
            ox6Var5 = ox6Var4;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: t67
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i77.b(o67Var, str, ox6Var5, diVar3, oh4Var13, oh4Var12, oh4Var11, oh4Var10, oh4Var5, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }
}
