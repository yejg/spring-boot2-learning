CREATE TABLE `tree`  (
  `id` bigint(11) NOT NULL,
  `pid` bigint(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `tree` VALUES (1, 0, '中国');
INSERT INTO `tree` VALUES (2, 1, '四川省');
INSERT INTO `tree` VALUES (3, 2, '成都市');
INSERT INTO `tree` VALUES (4, 3, '武侯区');
INSERT INTO `tree` VALUES (5, 4, '红牌楼');
INSERT INTO `tree` VALUES (6, 1, '广东省');
INSERT INTO `tree` VALUES (7, 1, '浙江省');
INSERT INTO `tree` VALUES (8, 6, '广州市');



CREATE FUNCTION `GET_CHILD_NODE`(rootId varchar(100))
RETURNS varchar(2000)
BEGIN
DECLARE str varchar(2000);
DECLARE cid varchar(100);
SET str = '$';
SET cid = rootId;
WHILE cid is not null DO
    SET str = concat(str, ',', cid);
    SELECT group_concat(id) INTO cid FROM tree where FIND_IN_SET(pid, cid);
END WHILE;
RETURN str;
END
