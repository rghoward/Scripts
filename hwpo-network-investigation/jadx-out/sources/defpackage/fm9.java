package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fm9<T> implements ze2<T> {
    public final hm9 a;
    public final gm9 b;
    public final Context c;
    public final String d;
    public final o7a e;
    public final Set<String> f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {145}, m = "shouldMigrate", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int v;

        public a(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return fm9.this.shouldMigrate(null, this);
        }
    }

    public fm9(final Context context, final String str, Set set, hm9 hm9Var, gm9 gm9Var) {
        context.getClass();
        set.getClass();
        mh4 mh4Var = new mh4() { // from class: em9
            @Override // defpackage.mh4
            public final Object invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            }
        };
        this.a = hm9Var;
        this.b = gm9Var;
        this.c = context;
        this.d = str;
        this.e = new o7a(mh4Var);
        this.f = set == jm9.a ? null : th1.W(set);
    }

    @Override // defpackage.ze2
    public final Object cleanUp(r02<? super g2b> r02Var) throws IOException {
        Context context;
        String str;
        o7a o7aVar = this.e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) o7aVar.getValue()).edit();
        Set<String> set = this.f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            o03.a("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) o7aVar.getValue()).getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            context.deleteSharedPreferences(str);
        }
        if (set != null) {
            set.clear();
        }
        return g2b.a;
    }

    @Override // defpackage.ze2
    public final Object migrate(T t, r02<? super T> r02Var) {
        return this.b.invoke(new mm9((SharedPreferences) this.e.getValue(), this.f), t, r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ze2
    public final Object shouldMigrate(T t, r02<? super Boolean> r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((u02) r02Var);
            }
        } else {
            aVar = new a((u02) r02Var);
        }
        Object objInvoke = aVar.t;
        int i2 = aVar.v;
        boolean z = true;
        if (i2 == 0) {
            dv8.b(objInvoke);
            aVar.v = 1;
            objInvoke = this.a.invoke(t, aVar);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        o7a o7aVar = this.e;
        Set<String> set = this.f;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) o7aVar.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) o7aVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
