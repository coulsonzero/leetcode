# 变更性别

难度：简单

**1. `Salary` 表：**
```
+-------------+----------+
| Column Name | Type     |
+-------------+----------+
| id          | int      |
| name        | varchar  |
| sex         | ENUM     |
| salary      | int      |
+-------------+----------+
id 是这个表的主键。
sex 这一列的值是 ENUM 类型，只能从 ('m', 'f') 中取。
```

**2.要求**
::: tip
请你编写一个 SQL 查询来交换所有的 'f' 和 'm' （即，将所有 'f' 变为 'm' ，反之亦然），仅使用 单个 update 语句 ，且不产生中间临时表。
:::

::: warning
注意，你必须仅使用一条 update 语句，且 不能 使用 select 语句。
:::


**3.Solution**

```sql
update salary set sex = if( sex = 'm', 'f', 'm');
```

```sql
update salary set sex = (case sex when 'm' then 'f' else 'm' end);
```