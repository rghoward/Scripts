package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class thb {
    public static final f b = new f();
    public final uhb a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static thb a(whb whbVar, c cVar, int i) {
            if ((i & 2) != 0) {
                cVar = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelProviderFactory() : sv2.a;
            }
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            cVar.getClass();
            defaultViewModelCreationExtras.getClass();
            return new thb(whbVar.getViewModelStore(), cVar, defaultViewModelCreationExtras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements lb2.b<String> {
    }

    public thb(vhb vhbVar, c cVar, lb2 lb2Var) {
        vhbVar.getClass();
        cVar.getClass();
        lb2Var.getClass();
        this.a = new uhb(vhbVar, cVar, lb2Var);
    }

    public final mhb a(sd1 sd1Var) {
        String strE = sd1Var.e();
        if (strE != null) {
            return this.a.a(sd1Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
        }
        z90.a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements c {
        public static d a;

        @Override // thb.c
        public final <T extends mhb> T create(wn5<T> wn5Var, lb2 lb2Var) {
            return (T) create(me3.b(wn5Var), lb2Var);
        }

        @Override // thb.c
        public <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
            lb2Var.getClass();
            return (T) create(cls);
        }

        @Override // thb.c
        public <T extends mhb> T create(Class<T> cls) {
            cls.getClass();
            return (T) bb7.a(cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        default <T extends mhb> T create(wn5<T> wn5Var, lb2 lb2Var) {
            wn5Var.getClass();
            lb2Var.getClass();
            return (T) create(me3.b(wn5Var), lb2Var);
        }

        default <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
            cls.getClass();
            lb2Var.getClass();
            return (T) create(cls);
        }

        default <T extends mhb> T create(Class<T> cls) {
            cls.getClass();
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e {
        public void a(mhb mhbVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends d {
        public static a c;
        public static final C0251a d = new C0251a();
        public final Application b;

        /* JADX INFO: renamed from: thb$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0251a implements lb2.b<Application> {
        }

        public a(Application application) {
            this.b = application;
        }

        public final <T extends mhb> T a(Class<T> cls, Application application) {
            if (!et.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e) {
                up2.a("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                up2.a("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                up2.a("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                up2.a("Cannot create an instance of ", cls, e4);
                return null;
            }
        }

        @Override // thb.d, thb.c
        public final <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
            lb2Var.getClass();
            if (this.b != null) {
                return (T) create(cls);
            }
            Application application = (Application) lb2Var.a(d);
            if (application != null) {
                return (T) a(cls, application);
            }
            if (!et.class.isAssignableFrom(cls)) {
                return (T) bb7.a(cls);
            }
            z90.a("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        @Override // thb.d, thb.c
        public final <T extends mhb> T create(Class<T> cls) {
            cls.getClass();
            Application application = this.b;
            if (application != null) {
                return (T) a(cls, application);
            }
            ru3.f("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
    }
}
