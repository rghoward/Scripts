package defpackage;

import com.intercom.twig.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mv8 {
    public final ConcurrentHashMap<Method, Object> a = new ConcurrentHashMap<>();
    public final o21.a b;
    public final f55 c;
    public final List<g52.a> d;
    public final List<q21.a> e;
    public final Executor f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements InvocationHandler {
        public final Object[] a = new Object[0];
        public final /* synthetic */ Class b;

        public a(Class cls) {
            this.b = cls;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0065 A[SYNTHETIC] */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            ae9 ae9VarB;
            Object obj2;
            Class<?> cls = this.b;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.a;
            }
            kl8 kl8Var = k08.b;
            if (kl8Var.c(method)) {
                return kl8Var.b(method, cls, obj, objArr);
            }
            mv8 mv8Var = mv8.this;
            while (true) {
                Object objPutIfAbsent = mv8Var.a.get(method);
                if (!(objPutIfAbsent instanceof ae9)) {
                    if (objPutIfAbsent != null) {
                        synchronized (objPutIfAbsent) {
                            obj2 = mv8Var.a.get(method);
                            if (obj2 == null) {
                                ae9VarB = (ae9) obj2;
                                break;
                            }
                        }
                    } else {
                        Object obj3 = new Object();
                        synchronized (obj3) {
                            try {
                                objPutIfAbsent = mv8Var.a.putIfAbsent(method, obj3);
                                if (objPutIfAbsent != null) {
                                    synchronized (objPutIfAbsent) {
                                        try {
                                            obj2 = mv8Var.a.get(method);
                                            if (obj2 == null) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    ae9VarB = (ae9) obj2;
                                    break;
                                }
                                try {
                                    ae9VarB = ae9.b(mv8Var, cls, method);
                                    mv8Var.a.put(method, ae9VarB);
                                    break;
                                } catch (Throwable th2) {
                                    mv8Var.a.remove(method);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } else {
                    ae9VarB = (ae9) objPutIfAbsent;
                    break;
                }
            }
            return ae9VarB.a(obj, objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public lg7 a;
        public f55 b;
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public final void a(String str) {
            f55.a aVar = new f55.a();
            aVar.d(null, str);
            f55 f55VarA = aVar.a();
            ArrayList arrayList = f55VarA.f;
            if (BuildConfig.FLAVOR.equals(arrayList.get(arrayList.size() - 1))) {
                this.b = f55VarA;
            } else {
                u.c(f55VarA, "baseUrl must end in /: ");
            }
        }

        public final mv8 b() {
            if (this.b == null) {
                aa0.c("Base URL required.");
                return null;
            }
            lg7 lg7Var = this.a;
            if (lg7Var == null) {
                lg7Var = new lg7();
            }
            lg7 lg7Var2 = lg7Var;
            ep epVar = k08.a;
            qy0 qy0Var = k08.c;
            ArrayList arrayList = new ArrayList(this.d);
            List<? extends q21.a> listA = qy0Var.a(epVar);
            arrayList.addAll(listA);
            List<? extends g52.a> listB = qy0Var.b();
            int size = listB.size();
            ArrayList arrayList2 = this.c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new py0());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(listB);
            f55 f55Var = this.b;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            listA.size();
            return new mv8(lg7Var2, f55Var, listUnmodifiableList, listUnmodifiableList2, epVar);
        }
    }

    public mv8(o21.a aVar, f55 f55Var, List list, List list2, Executor executor) {
        this.b = aVar;
        this.c = f55Var;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final q21<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<q21.a> list = this.e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            q21<?, ?> q21Var = list.get(i).get(type, annotationArr, this);
            if (q21Var != null) {
                return q21Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (!cls.isInterface()) {
            z90.a("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final <T> g52<T, qp8> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<g52.a> list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            g52<T, qp8> g52Var = (g52<T, qp8>) list.get(i).a(type, annotationArr, annotationArr2, this);
            if (g52Var != null) {
                return g52Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> g52<su8, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<g52.a> list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            g52<su8, T> g52Var = (g52<su8, T>) list.get(i).b(type, annotationArr, this);
            if (g52Var != null) {
                return g52Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<g52.a> list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
