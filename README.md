
# 📱 EmployeeApp - Application de Gestion des Employés

**EmployeeApp** est une application mobile Android développée en Java, permettant de gérer les employés et les départements d'une entreprise. Le projet inclut une interface de connexion statique, une page d'accueil avec des statistiques, et des fonctionnalités CRUD avec stockage local en SQLite.

---

## 🛠️ Fonctionnalités

- 🔐 **Connexion =** 
- 🏠 **Page d’accueil** : affichage du nombre d’employés et de départements  

## en cours

- 👤 **Gestion des employés** :
  - Ajouter un employé
  - Modifier un employé
  - Supprimer un employé
  - Lister tous les employés  
- 🏢 **Gestion des départements** :
  - Ajouter un département
  - Modifier un département
  - Supprimer un département
  - Voir la liste des départements

---

## 🧰 Technologies utilisées

- **Langage :** Java  
- **Base de données :** SQLite  
- **IDE :** Android Studio  
- **Architecture du projet :**
  - `activities/` : Écrans principaux de l'application
  - `models/` : Représentation des données (Employe, Department)
  - `adapters/` : Adaptateurs pour les ListView

---

## 📂 Structure du projet

```
EmployeeApp/
│
├── activities/
│   ├── LoginActivity.java
│   ├── MainActivity.java
│   ├── EmployeActivity.java
│   └── DepartmentActivity.java
│
├── adapters/
│   └── EmployeAdapter.java
│
├── models/
│   ├── Employe.java
│   └── Department.java
│
├── database/
│   └── DBHelper.java
│
└── res/
    └── layout/
```

---

## 🧪 Comment exécuter le projet

1. Ouvrir **Android Studio**
2. Cloner ce dépôt ou importer le projet
3. Lancer l’émulateur ou brancher un appareil Android
4. Lancer l’application : `Run > Run 'app'`

---

## 🔐 Identifiants de connexion

```
Nom d'utilisateur : admin  
Mot de passe      : admin
```

---


## 📌 Auteurs

- Projet réalisé dans le cadre d’un cours de développement mobile.
- Développé par : ** Zeini et Bezeid **

---

## 🏁 Améliorations futures

- Connexion avec un backend Spring Boot via API REST
- Gestion des rôles (admin, RH, etc.)

