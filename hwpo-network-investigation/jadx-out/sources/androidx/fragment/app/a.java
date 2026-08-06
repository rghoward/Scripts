package androidx.fragment.app;

import android.util.Log;
import defpackage.aa0;
import defpackage.fg4;
import defpackage.s66;
import defpackage.ue4;
import defpackage.vh0;
import defpackage.w27;
import defpackage.x24;
import defpackage.xd6;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r implements l.k, l.q {
    public final l r;
    public boolean s;
    public int t;

    public a(l lVar) {
        lVar.J();
        ue4<?> ue4Var = lVar.x;
        if (ue4Var != null) {
            ue4Var.u.getClassLoader();
        }
        this.a = new ArrayList<>();
        this.h = true;
        this.p = false;
        this.t = -1;
        this.r = lVar;
    }

    @Override // androidx.fragment.app.l.q
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (l.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.r
    public final a c(f fVar) {
        l lVar = fVar.mFragmentManager;
        if (lVar == null || lVar == this.r) {
            b(new r.a(fVar, 6));
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.r
    public final void d(int i, f fVar, String str, int i2) {
        String str2 = fVar.mPreviousWho;
        if (str2 != null) {
            fg4.c(fVar, str2);
        }
        Class<?> cls = fVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            vh0.b(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = fVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fVar);
                sb.append(": was ");
                aa0.c(w27.a(sb, fVar.mTag, " now ", str));
                return;
            }
            fVar.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fVar + " with tag " + str + " to container view with no id");
            }
            int i3 = fVar.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fVar);
                int i4 = fVar.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fVar.mFragmentId = i;
            fVar.mContainerId = i;
        }
        b(new r.a(fVar, i2));
        fVar.mFragmentManager = this.r;
    }

    @Override // androidx.fragment.app.r
    public final a e(f fVar, s66.b bVar) {
        l lVar = fVar.mFragmentManager;
        l lVar2 = this.r;
        if (lVar != lVar2) {
            defpackage.u.c(lVar2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return null;
        }
        if (bVar == s66.b.u && fVar.mState > -1) {
            x24.b(bVar, " after the Fragment has been created", "Cannot set maximum Lifecycle to ");
            return null;
        }
        if (bVar == s66.b.t) {
            x24.b(bVar, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.", "Cannot set maximum Lifecycle to ");
            return null;
        }
        r.a aVar = new r.a();
        aVar.a = 10;
        aVar.b = fVar;
        aVar.c = false;
        aVar.h = fVar.mMaxState;
        aVar.i = bVar;
        b(aVar);
        return this;
    }

    public final void f(int i) {
        ArrayList<r.a> arrayList = this.a;
        if (this.g) {
            if (l.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                r.a aVar = arrayList.get(i2);
                f fVar = aVar.b;
                if (fVar != null) {
                    fVar.mBackStackNesting += i;
                    if (l.M(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList<r.a> arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            r.a aVar = arrayList.get(size);
            if (aVar.c) {
                if (aVar.a == 8) {
                    aVar.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.b.mContainerId;
                    aVar.a = 2;
                    aVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        r.a aVar2 = arrayList.get(i2);
                        if (aVar2.c && aVar2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.l.k
    public final String getName() {
        return this.i;
    }

    public final int h(boolean z, boolean z2) {
        if (this.s) {
            aa0.c("commit already called");
            return 0;
        }
        if (l.M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new xd6());
            j("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z3 = this.g;
        l lVar = this.r;
        if (z3) {
            this.t = lVar.k.getAndIncrement();
        } else {
            this.t = -1;
        }
        if (z2) {
            lVar.y(this, z);
        }
        return this.t;
    }

    public final void i() {
        if (this.g) {
            aa0.c("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.B(this, false);
        }
    }

    public final void j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList<r.a> arrayList = this.a;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r.a aVar = arrayList.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public final a k(f fVar) {
        l lVar = fVar.mFragmentManager;
        if (lVar == null || lVar == this.r) {
            b(new r.a(fVar, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
